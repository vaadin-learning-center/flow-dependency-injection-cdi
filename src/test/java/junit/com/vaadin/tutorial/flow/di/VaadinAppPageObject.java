package junit.com.vaadin.tutorial.flow.di;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.testbench.TestBenchTestCase;
import com.vaadin.tutorial.flow.di.VaadinApp;
import org.openqa.selenium.WebDriver;
import org.vaadin.tutorial.nano.jetty.junit5.WebDriverParameterResolver;

public class VaadinAppPageObject
    extends WebDriverParameterResolver.GenericPageObject {

  private final TestBenchTestCase testCase = new TestBenchTestCase() { };

  public VaadinAppPageObject(WebDriver webdriver, String hostIpAddress, String vncAdress) {
    super(webdriver, hostIpAddress, vncAdress);
    this.testCase.setDriver(webdriver);
  }

  public SpanElement labelCounter() {
    return this.testCase.$(SpanElement.class)
               .id(VaadinApp.SPAN_ID);
  }

  public ButtonElement btn() {
    return this.testCase.$(ButtonElement.class)
               .id(VaadinApp.BUTTON_ID);
  }

  public void load(String url) {
    testCase.getDriver().get(url);
  }
}
