package junit.com.vaadin.tutorial.flow.di.services;

import com.vaadin.tutorial.flow.di.services.Counter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CounterTest {


  @Test
  void test001() {
    Counter counter = new Counter();
    Assertions.assertEquals(1, counter.inc());
    Assertions.assertEquals(2, counter.inc());
    Assertions.assertEquals(3, counter.inc());
  }
}
