package edu.cnm.hsd.java8streams;

import java.util.stream.Stream;

public class App {
  /*
   * public static final String[] colors = {"Red", "Red", "Orange", "Orange", "Yellow", "Green",
   * "Blue", "Indigo", "Violet"};
   */

  private static final Integer[] nums = {34, 67, 9, 12, -33};
  private static final Integer[] nums2 = {4, 5, 3};

  public static void main(String[] args) {

    Stream<Integer> stream1 = Stream.of(nums);
    Stream<Integer> stream2 = Stream.of(nums2);

    Stream.concat(stream1, stream2).sorted().forEach(System.out::println);

  }


}
