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

    // findFirst
    Optional<String> first = Arrays.asList(colors).stream().skip(10).findFirst();
    if (first.isPresent()) {
      System.out.println(first.orElseGet(null));

    } else {
      System.out.println("Not present.");
    }

  }
}
