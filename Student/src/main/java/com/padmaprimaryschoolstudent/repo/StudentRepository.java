package com.padmaprimaryschoolstudent.repo;

import com.padmaprimaryschoolstudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
