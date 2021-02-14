package edu.cnm.hsd.java8streams;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


  static final String[][] testColors = {

      {"Red", "Red", "Orange", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"},
      {"Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"}, {"Blue", "Indigo", "Violet"}};


  static final long[] expected = {5, 4, 2};

  @Test
  public void testConsumerCount() {

    for (int i = 0; i < expected.length; i++) {
      long actual = App.aConsumer(testColors[i]);
      assertEquals(expected[i], actual);
    }


  }
}
