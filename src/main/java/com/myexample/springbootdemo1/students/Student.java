package com.myexample.springbootdemo1.students;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {

  @Id
  @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
  private Long id;
  private String name;

  @Column(unique = true)
  private String email;
  private LocalDate dob;

  public Student(String name, String email, LocalDate dob) {
    this.name = name;
    this.email = email;
    this.dob = dob;
  }

  public int getAge(){
    return Period.between(dob, LocalDate.now()).getYears();
  }
}
