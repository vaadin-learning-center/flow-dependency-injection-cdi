/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vaadin.tutorial.flow.di;


import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.flow.di.services.Counter;
import org.rapidpm.dependencies.core.logger.HasLogger;

import javax.inject.Inject;

import static java.lang.String.valueOf;

@Route("")
public class VaadinApp
    extends Composite<Div>
    implements HasLogger {

  @Inject private Counter clickcounter;

  public static final String BUTTON_ID = "buttonID";
  public static final String SPAN_ID   = "buttonClickCount";

  private final Button         btnClickMe   = new Button("click me");
  private final Span           lbClickCount = new Span("0");
  private final VerticalLayout layout       = new VerticalLayout(btnClickMe, lbClickCount);

  public VaadinApp() {
    lbClickCount.setId(SPAN_ID);

    btnClickMe.setId(BUTTON_ID);
    btnClickMe.addClickListener(event -> lbClickCount.setText(valueOf(clickcounter.inc())));
    logger().info("setting now the main ui content..");
    getContent().add(layout);

  }
}
