package com.iamneo.intro.controller;

import com.iamneo.intro.model.Student;
import com.iamneo.intro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        boolean isDataSaved= studentService.saveStudent(student);

        return isDataSaved ? ResponseEntity.status(200).body("Student saved successfully!"): ResponseEntity.status(404).body("Something went wrong!");
    }
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList=studentService.getAllStudent();
        return studentList.size()>0? ResponseEntity.status(200).body(studentList): ResponseEntity.status(404).body(null);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById( @PathVariable Long id){
        Student student=studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);

    }

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getStudentByRequest( @RequestParam Long id){
        Student student=studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable Long id){
        Student student1=studentService.updateStudent(id,student);
        return ResponseEntity.status(200).body(student1);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        boolean isDeleted=studentService.deleteStudent(id);
        return isDeleted? ResponseEntity.status(200).body("Record deleted"):ResponseEntity.status(400).body("Something went wrong!");
    }
}
