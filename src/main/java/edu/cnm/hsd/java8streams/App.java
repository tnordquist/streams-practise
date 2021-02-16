package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class App {
  /*
   * public static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green",
   * "Blue", "Indigo", "Violet"};
   */

  private static final Integer[] nums = {34, 67, 9, 12, -33};
  private static final int[] nums2 = {34, 67, 9, 12, -3, 1001};

  public static void main(String[] args) {
    Optional<User> min = Arrays
        .asList(new User("Tony", 45, Arrays.asList("Red", "Green")),
            new User("Mark", 61, Arrays.asList("Blue", "Green", "White")),
            new User("Adam", 61,
                Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")),
            new User("Ben", 19, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")))
        .stream().min((val1, val2) -> val1.getColors().size() < val2.getColors().size() ? -1
            : val1.getColors().size() > val2.getColors().size() ? 1 : 0);

    min.ifPresent(val -> System.out.println(val.getFirstName()));
    
    OptionalInt min2 = IntStream.of(nums2).min();
    
    System.out.println(min2.getAsInt());
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
