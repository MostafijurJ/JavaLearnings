package com.learn.java.email.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmailValidation {
  private static final String EMAIL_REGEX = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
  private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

  public void emailChecking() {
    List<String> emailAddress = new ArrayList<>();
    emailAddress.add("367991330@stu.iu.edu.sa");
    emailAddress.add("avilash&amp;manager@yopmail.com");
    emailAddress.add("avilash&manager@yopmail.com");

    for (var email : emailAddress) {
      var out = EMAIL_PATTERN.matcher(email).matches();
      System.out.println(email + "--> " + out);
    }
  }
}
