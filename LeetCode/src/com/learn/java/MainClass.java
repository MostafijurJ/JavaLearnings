package com.learn.java;

import com.learn.java.daily.DetectCapital;
import com.learn.java.daily.ValidMountain;

public class MainClass {
  public static void main(String[] args) {

    /** Detect capital */
    /* System.out.println(new DetectCapital().detectCapital("USA"));*/

    /** VALID Mountain Array */
    System.out.println(new ValidMountain().validMountain(new int[] {0,3,2,1}));
  }
}
