package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class App {
  public static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};
  private static final int[] nums2 = {34, 67, 9, 12, -3, 1001};

  public static void main(String[] args) {
    Optional<User> max = Arrays
        .asList(new User("Tony", 45, Arrays.asList("Red", "Green")),
            new User("Mark", 21, Arrays.asList("Blue", "Green", "White")),
            new User("Ben", 19, Arrays.asList("Red", "Green", "Yellow", "Indigo")),
            new User("Jed", 61, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia")))
        .stream().max(Comparator.comparing(User::getAge));

    max.ifPresent(maxVal -> System.out.println(maxVal.getFirstName()));
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
