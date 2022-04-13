package com.myexample.springbootdemo1.students;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(path = "list")
  public List<Student> list() {
    return studentService.list();
  }

  @PostMapping(path = "item")
  public void add(@RequestBody Student student) {
    studentService.add(student);
  }

  @DeleteMapping(path = "item/{studentId}")
  public void delete(@PathVariable Long studentId) {
    studentService.delete(studentId);
  }

  @PutMapping(path = "item")
  public void update(@RequestBody Student student) {
    studentService.update(student);
  }
}
