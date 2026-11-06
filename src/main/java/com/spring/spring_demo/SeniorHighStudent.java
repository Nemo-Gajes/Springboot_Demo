package com.spring.spring_demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 
@Lazy 
public class SeniorHighStudent implements Student {

  public SeniorHighStudent() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@SeniorHighStudent: inside default constructor");
  }

  @Override
  public String getDailyAssignment() {
    return "bding";
  }
}
