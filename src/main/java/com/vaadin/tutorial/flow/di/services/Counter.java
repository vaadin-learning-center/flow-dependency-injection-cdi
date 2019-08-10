package com.vaadin.tutorial.flow.di.services;

import com.vaadin.cdi.annotation.VaadinSessionScoped;

@VaadinSessionScoped
public class Counter {

  private int counter = 0;

  public int inc() {
    counter++;
    return counter;
  }
}
