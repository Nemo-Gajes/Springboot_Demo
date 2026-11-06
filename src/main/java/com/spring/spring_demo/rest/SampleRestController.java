package com.spring.spring_demo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SampleRestController {

  private Student myStudent;
  // private Student anotherStudent;

  
  public SampleRestController(@Qualifier("elementaryStudent") Student student) {
    myStudent = student;
  }

  @GetMapping("/assignment")
  public String getAssignment() {
      return myStudent.getDailyAssignment();
  }
  

  // public SampleRestController(@Qualifier("universityStudent") Student student, 
  //                              @Qualifier("universityStudent") Student student_two) {
  //   myStudent = student;
  //   anotherStudent = student_two;
  // }

  // @GetMapping("/check")
  // public String checkScope() {
  //     return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
  // }
  

  // @Autowired
  // public void setStudent(@Qualifier("juniorHighStudent") Student Student) {
  //   myStudent = Student;
  // }

  // @GetMapping("/assignment")
  // public String getDailyAssignment() {
  //   return myStudent.getDailyAssignment();
  // }
  
}
