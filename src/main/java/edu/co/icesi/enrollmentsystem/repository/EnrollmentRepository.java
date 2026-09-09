package edu.co.icesi.enrollmentsystem.repository;

import edu.co.icesi.enrollmentsystem.model.Enrollment;
import edu.co.icesi.enrollmentsystem.model.EnrollmentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
}
