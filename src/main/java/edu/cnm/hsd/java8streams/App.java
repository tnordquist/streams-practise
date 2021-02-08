package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App {
  private static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};


  public static void main(String[] args) {

    // findAny
    Optional<String> any = Arrays.asList(colors).stream().distinct().limit(7).findAny();

    if (any.isPresent()) {
      System.out.println(any.get());
    } else {
      System.out.println("Not present.");
    }
  }
}
