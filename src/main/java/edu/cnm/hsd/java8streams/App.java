package edu.cnm.hsd.java8streams;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
  private static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};


  public static void main(String[] args) {

    // skip
    Arrays.asList(colors).stream().skip(4).forEach(System.out::println);

  }
}
