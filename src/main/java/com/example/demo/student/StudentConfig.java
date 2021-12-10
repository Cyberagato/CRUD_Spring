package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

   /* @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student temirlan = new Student(
                    "Temirlan",
                    "Khakhazov",
                    LocalDate.of(2002, Month.DECEMBER, 16),
                    "thahazov02@gmail.com",
                    3.39
            );

            Student aisar = new Student(
                    "Aisar",
                    "Asqarbekov",
                    LocalDate.of(2001, Month.FEBRUARY, 16),
                    "asqarbekoff@gmail.com",
                    3.49
            );

            Student arman = new Student(
                    "Arman",
                    "Tursynbek",
                    LocalDate.of(2001, Month.FEBRUARY, 16),
                    "armantursy@gmail.com",
                    2.49
            );

            repository.saveAll(
                    List.of(temirlan, aisar)
            );
        };

    */
    }

