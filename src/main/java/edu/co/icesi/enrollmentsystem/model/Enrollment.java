package edu.co.icesi.enrollmentsystem.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ENROLLMENTS")
public class Enrollment {
    // Clave primaria compuesta
    @EmbeddedId
    private EnrollmentId id = new EnrollmentId();

    // Relación Muchos-A-Uno con Student
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private Student student;

    // Relación Muchos-A-Uno con Course
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    private Course course;


    // Atributo adicional propio de la tabla intermedia (opcional pero muy útil)
    private LocalDate enrollmentDate;

    public Enrollment() {
    }

    public Enrollment(Student student, Course course, LocalDate enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        // Inicializamos el ID compuesto con los IDs de las entidades relacionadas
        this.id = new EnrollmentId(student.getId(), course.getId());
    }

    public EnrollmentId getId() {
        return id;
    }

    public void setId(EnrollmentId id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
