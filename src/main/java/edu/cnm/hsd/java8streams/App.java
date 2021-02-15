package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class App {
  public static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};
  private static final int[] nums2 = {34, 67, 9, 12, -3, 1001};

  public static void main(String[] args) {
    OptionalInt max = Arrays.asList(nums).stream().mapToInt(value -> value).max();

    OptionalInt max2 = IntStream.of(nums2).max();

    max2.ifPresent(maxVal -> System.out.println(maxVal));
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
