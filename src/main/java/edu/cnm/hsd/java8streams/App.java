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
    long count = Arrays.asList(colors).stream().filter(isLengthSixChars).count();
    System.out.println(count);

    // allMatch
    // boolean colorLengthSix = Arrays.asList(colors).stream().anyMatch(isLengthSixChars);
    // System.out.println(colorLengthSix);

    // allMatch
    boolean colorLengthSix = Arrays.asList(colors).stream().allMatch(isLengthGreaterThanTwo);
    System.out.println(colorLengthSix);
  }

  private static Predicate<String> isLengthSixChars = color -> color.length() == 6;
  private static Predicate<String> isLengthGreaterThanTwo = color -> color.length() > 3;
}
