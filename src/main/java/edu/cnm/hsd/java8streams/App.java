package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App {
  private static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};

  public static void main(String[] args) {

    // Predicate
    long count = Arrays.asList(colors).stream().filter(isLengthThreeChars).count();
    System.out.println(count);
  }

  private static Predicate<String> isLengthThreeChars = color -> color.length() == 6;
}
