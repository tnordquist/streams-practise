package edu.cnm.hsd.java8streams;

import java.util.Arrays;

public class App {
  /*
   * public static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green",
   * "Blue", "Indigo", "Violet"};
   */

  private static final Integer[] nums = {34, 67, 9, 12, -33};
  private static final Integer[] nums2 = {4, 5, 3};

  public static void main(String[] args) {


    Integer reduceInteger = Arrays.asList(new User("Tony", 45, Arrays.asList("Red", "Green")),
        new User("Mark", 61, Arrays.asList("Blue", "Green", "White")),
        new User("Adam", 61, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")),
        new User("Ben", 19, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")),
        new User("Alice", 105, Arrays.asList("Red", "Green", "Ruby", "White")),
        new User("George", 21, Arrays.asList("Blue", "Green", "White")),
        new User("Judith", 48, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")),
        new User("Beth", 37, Arrays.asList("Blue", "Green", "White", "Orange", "Fuscia", "Ink")))
        .stream().filter(User -> User.getAge() > 35)
        .reduce(0, (subTotal, element) -> subTotal + element.getAge(), Integer::sum);

    System.out.println(reduceInteger);

  }


}
