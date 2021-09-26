package com.qlicue.loans.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
        Student mariam=    new Student(

                    "Mariam",
                    "maria.james@gmail.com",
                    LocalDate.of(1988,APRIL, 16),33
            );
            Student alex=    new Student(

                    "Alex",
                    "alex.john@gmail.com",
                    LocalDate.of(2000,APRIL, 16),21
            );

            repository.saveAll(List.of(mariam,alex));
        };
    }
}
