package edu.co.icesi.enrollmentsystem.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


    /**
     * @Embeddable indica a JPA que esta clase no es una tabla en sí misma,
     * sino un grupo de campos que pueden ser embebidos como Clave Primaria o atributo en otra entidad.
     */

@Embeddable
public class EnrollmentId implements Serializable {
        @Column(name = "student_id")
        private Long studentId;

        @Column(name = "course_id")
        private Long courseId;

        // 1. Constructor vacío obligatorio por JPA
        public EnrollmentId() {
        }

        // 2. Constructor con parámetros
        public EnrollmentId(Long studentId, Long courseId) {
            this.studentId = studentId;
            this.courseId = courseId;
        }

        // 3. Getters y Setters
        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        public Long getCourseId() {
            return courseId;
        }

        public void setCourseId(Long courseId) {
            this.courseId = courseId;
        }

        // 4. MÉTODOS OBLIGATORIOS: equals() y hashCode()
        // JPA los utiliza internamente para comparar claves compuestas en memoria y en caché.
        @Override
        public boolean equals(Object o) {
            // 1. ¿Apuntan exactamente a la misma posición de memoria RAM? Si sí, son iguales.
            if (this == o) return true;

            // 2. ¿El objeto a comparar es nulo o es de una clase distinta? Si es así, no son iguales.
            if (o == null || getClass() != o.getClass()) return false;

            // 3. Convertimos el objeto genérico a tipo EnrollmentId para poder comparar sus variables.
            EnrollmentId that = (EnrollmentId) o;

            // 4. COMPARA LOS VALORES REALES: ¿Tienen el mismo studentId Y el mismo courseId?
            return Objects.equals(studentId, that.studentId) && Objects.equals(courseId, that.courseId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId, courseId);
        }




}

