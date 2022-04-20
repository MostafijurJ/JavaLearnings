package com.learn.java;

import com.learn.java.daily_challenges.AnagramFindings;
import com.learn.java.daily_challenges.RichestCustomerWealth;
import com.learn.java.daily_challenges.ValidMountain;
import com.learn.java.email.validation.EmailValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainClass {
  public static void main(String[] args) {

    /** Detect capital */
    /* System.out.println(new DetectCapital().detectCapital("USA"));*/

    /** VALID Mountain Array */
    //    System.out.println(new ValidMounotain().validMountain(new int[] {0,3,2,1}));

    /** Richest Customer Wealth */
    // System.out.println(new RichestCustomerWealth().maximumWealth(new int[][] {{1,2},{3,4}}));
    /** Anagrams in a String */
    // System.out.println(new AnagramFindings().findAnagrams("cbaebabacd", "abc"));
    new EmailValidation().emailChecking();

  }
}
