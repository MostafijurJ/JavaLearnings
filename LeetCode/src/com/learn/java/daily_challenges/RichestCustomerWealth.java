package com.learn.java.daily_challenges;

public class RichestCustomerWealth {

  public static int maximumWealth(int[][] accounts) {
    int len = accounts.length;
    int[] wealth = new int[len];
    int ans = 0;
    for (int i = 0; i < len; i++) {
      int sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
        ans = Math.max(ans, sum);
      }
    }
    return ans;
  }
}
