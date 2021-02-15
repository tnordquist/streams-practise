package edu.cnm.hsd.java8streams;

import java.util.Arrays;
import java.util.List;

public class User {

  private String firstName;
  private int age;
  private List<String> colors;

  public User(String firstName, int age, List<String> colors) {
    this.firstName = firstName;
    this.age = age;
    this.colors = colors;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getAge() {
    return age;
  }

  public List<String> getColors() {
    return colors;
  }

  public String[] userInfo(User[] user) {
    String[] strs = (String[]) Arrays.asList(user).stream().filter(user1 -> user1.getAge() > 30)
        .map(user2 -> user2.getFirstName()).toArray();
    return strs;
  }


}
