package com.iamneo.intro.model;
import jakarta.persistence.*;

@Entity
@Table(name="new_student")
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Student() {
    }

    private String dept;
    public Student(Long id, String name, String email, String dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
