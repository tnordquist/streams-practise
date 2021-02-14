package edu.cnm.hsd.java8streams;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  
  
  private static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
  private static final String[] colors2 =
    {"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
  private static final String[] colors3 =
    {"Blue", "Indigo", "Violet"};

  
  @Test
  public void testConsumer() {

    assertEquals(44, App.aConsumer());

  }
}
