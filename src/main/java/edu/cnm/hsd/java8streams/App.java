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

    /*
     * Arrays .asList(new User("Tony", 45, Arrays.asList("Red", "Green")), new User("Mark", 61,
     * Arrays.asList("Blue", "Green", "White")), new User("Adam", 61, Arrays.asList("Blue", "Green",
     * "White", "Orange", "Fuscia", "Ink")), new User("Ben", 19, Arrays.asList("Blue", "Green",
     * "White", "Orange", "Fuscia", "Ink")))
     * .stream().sorted(Comparator.comparing(User::getFirstName)) .forEach(user ->
     * System.out.println(user.getFirstName()));
     */

    Integer reduce = Arrays.asList(nums2).stream().filter(num -> num > 2).reduce(0,
        (subTotal, element) -> subTotal + element);

    System.out.println(reduce);
  }


}
