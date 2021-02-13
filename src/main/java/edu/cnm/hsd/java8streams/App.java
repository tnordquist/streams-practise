package edu.cnm.hsd.java8streams;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
  private static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};


  public static void main(String[] args) {

    // sorted
    Arrays.asList(nums).stream().distinct().sorted().forEach(System.out::println);
  }
}
