package com.myexample.springbootdemo1.students;

import java.time.LocalDate;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

  @Bean
  public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
    return args -> studentRepository.saveAll(Arrays.asList(
        new Student("Alex", "alex@gmail.com", LocalDate.now().minusDays(25).minusYears(15)),
        new Student("Tom", "tom@gmail.com", LocalDate.now().minusDays(27).minusYears(25))
    ));
  }
}
