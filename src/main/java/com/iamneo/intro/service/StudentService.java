package com.iamneo.intro.service;

import com.iamneo.intro.model.Student;

import java.util.List;

public interface StudentService {
    boolean saveStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    boolean deleteStudent(Long id);
}
