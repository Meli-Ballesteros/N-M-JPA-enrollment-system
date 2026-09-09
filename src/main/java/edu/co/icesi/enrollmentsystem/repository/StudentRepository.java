package edu.co.icesi.enrollmentsystem.repository;
import edu.co.icesi.enrollmentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
