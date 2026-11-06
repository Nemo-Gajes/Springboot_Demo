package com.spring.spring_demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UniversityStudent implements Student {

  public UniversityStudent() {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@UniversityStudent: inside default constructor");
  }

  @Override
  public String getDailyAssignment() {
    return "Study String Boot Coding";
  }
}
