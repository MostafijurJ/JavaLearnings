package com.learn.java.daily;

public class DetectCapital {
  public static void main(String[] args) {
    System.out.println(new DetectCapital().detectCapital("aaaaa"));
  }

  private boolean detectCapital(String word) {
    int count = 0;
    for (int i = 0; i < word.length(); i++)
      if (word.charAt(i) - 'A' < 26) count++;
    if (count == word.length())
      return true;
    else if (count == 1 && word.charAt(0) - 'A' < 26)
      return true;
    else return count == 0;
  }
}
