package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.Comparator;

public class App {
  /*
   * public static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green",
   * "Blue", "Indigo", "Violet"};
   */

  private static final Integer[] nums = {34, 67, 9, 12, -33};
  private static final Integer[] nums2 = {34, 67, 9, 12, -3, 1001};

  public static void main(String[] args) {

    Arrays.asList(nums2).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
  }


}
