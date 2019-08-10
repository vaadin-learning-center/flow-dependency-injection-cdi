package junit.com.vaadin.tutorial.flow.di;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.vaadin.tutorial.nano.jetty.junit5.VaadinTutorial;

@VaadinTutorial
public class VaadinAppTest
    implements HasLogger {


  @Test
  void test001(VaadinAppPageObject pageObject) {
    final String url = "http://" + pageObject.getHostIpAddress() + ":8899/";
    logger().info("URL : " + url);
    pageObject.load(url);
    Assertions.assertEquals("0",pageObject.labelCounter().getText());
    pageObject.btn().click();
    Assertions.assertEquals("1",pageObject.labelCounter().getText());
    pageObject.btn().click();
    Assertions.assertEquals("2",pageObject.labelCounter().getText());
  }
}
