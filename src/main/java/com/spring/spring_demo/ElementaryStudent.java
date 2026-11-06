package com.spring.spring_demo;

public class ElementaryStudent implements Student {

  public ElementaryStudent() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyAssignment() {
    return "Do your Nihongo shukudai bro bro.";
  }

}
