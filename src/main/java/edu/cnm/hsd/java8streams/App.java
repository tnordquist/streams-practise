package edu.cnm.hsd.java8streams;

import java.util.Arrays;

public class App {
  public static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};

  public static void main(String[] args) {

  }

  public static long aConsumer(String[] colors) {
    // consumer Functional Interface

    long count = Arrays.asList(colors).stream().filter(color -> color.length() > 5)
        .peek(color -> System.out.println("Filter value = " + color))
        .map(color -> color.toUpperCase())
        .peek(color -> System.out.println("Mapped value = " + color)).count();
    return count;
  }

}
