package com.myexample.springbootdemo1.students;

import com.myexample.springbootdemo1.response.RestApiException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private final StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> list() {
    return studentRepository.findAll();
  }

  public void add(Student student) {
    if (studentRepository.findStudentByEmail(student.getEmail()).isPresent()){
      throw new RestApiException("Email is busy");
    }
    studentRepository.save(student);
  }

  public void delete(Long studentId) {
    studentRepository.deleteById(studentId);
  }

  public void update(Student student) {
    Student updated = studentRepository.findById(student.getId()).orElse(null);
    if (updated != null) {
      updated.setName(student.getName());
      updated.setDob(student.getDob());
      studentRepository.save(student);
    }
  }
}
