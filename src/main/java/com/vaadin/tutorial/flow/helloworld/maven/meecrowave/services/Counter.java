package com.vaadin.tutorial.flow.helloworld.maven.meecrowave.services;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Counter {

  private int counter = 0;

  public int inc() {
    counter++;
    return counter;
  }
}
