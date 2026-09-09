package edu.co.icesi.enrollmentsystem.repository;
import edu.co.icesi.enrollmentsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
}
