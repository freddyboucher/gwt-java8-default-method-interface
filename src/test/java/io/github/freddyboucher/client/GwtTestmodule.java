package io.github.freddyboucher.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

public class GwtTestmodule extends GWTTestCase {

  @Override
  public String getModuleName() {
    return "io.github.freddyboucher.moduleJUnit";
  }

  public void testGenerator() {
    Person person = GWT.create(Person.class);
    assertEquals("Paul", person.getName());
    assertEquals("male", person.getGender());
  }

}
