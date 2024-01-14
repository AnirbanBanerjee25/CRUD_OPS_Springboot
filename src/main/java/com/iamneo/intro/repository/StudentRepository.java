package com.iamneo.intro.repository;
import java.util.Optional;
import com.iamneo.intro.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> existsByEmail(String email);
}
