package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.MARCH;

@Configurable
public class StudentConfig {

    @Bean
     CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student moez = new Student(
                    "moez",
                    "moezmtk@gmail.com",
                    LocalDate.of(1991,
                            MARCH,
                            28)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1990,
                            MARCH,
                            20)
            );

            repository.saveAll(
                    List.of(moez, alex)
            );

        };
    }

}
