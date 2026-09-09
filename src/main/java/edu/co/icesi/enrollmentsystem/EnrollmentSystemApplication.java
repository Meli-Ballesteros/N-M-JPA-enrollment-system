package edu.co.icesi.enrollmentsystem;

import edu.co.icesi.enrollmentsystem.repository.EnrollmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnrollmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrollmentSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner verifyData(EnrollmentRepository enrollmentRepository) {
        return args -> {
            System.out.println("\n========== VERIFICANDO DATOS CARGADOS DESDE DATA.SQL ==========\n");

            enrollmentRepository.findAll().forEach(enrollment -> {
                System.out.println("Tupla intermedia -> Estudiante ID: " + enrollment.getStudent().getId() +
                        " (" + enrollment.getStudent().getName() + ")" +
                        " | Curso ID: " + enrollment.getCourse().getId() +
                        " (" + enrollment.getCourse().getName() + ")" +
                        " | Fecha Matrícula: " + enrollment.getEnrollmentDate());
            });

            System.out.println("\n================================================================\n");
        };
    }
}