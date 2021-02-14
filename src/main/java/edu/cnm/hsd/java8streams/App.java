package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
  public static final String[] colors =
      {"Red", "Red", "Orange", "Orange", "Yello", "Green", "Blue", "Indigo", "Violet"};

  private static final Integer[] nums = {34, 67, 9, 12, -3};

  public static void main(String[] args) {

    System.out.println(aConsumer());
  }

  public static int aConsumer() {
    // consumer Functional Interface
    AtomicInteger count = new AtomicInteger();
    Arrays.asList(colors).stream().forEach(color -> count.addAndGet(color.length()));
    return count.get();
  }

}
