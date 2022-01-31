package com.learn.java;

import com.learn.java.daily_challenges.RichestCustomerWealth;
import com.learn.java.daily_challenges.ValidMountain;

public class MainClass {
  public static void main(String[] args) {

    /** Detect capital */
    /* System.out.println(new DetectCapital().detectCapital("USA"));*/

    /** VALID Mountain Array */
    //    System.out.println(new ValidMounotain().validMountain(new int[] {0,3,2,1}));

    /** Richest Customer Wealth */
    System.out.println(new RichestCustomerWealth().maximumWealth(new int[][] {{1,2},{3,4}}));
  }
}
