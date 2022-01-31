package com.learn.java.daily_challenges;

public class MaximumXOR {
  public static void main(String[] args) {
    System.out.println(findMaximumXOR(new int[] {3,10,5,25,2,8})); //
    System.out.println(findMaximumXOR(new int[] {14,70,53,83,49,91,36,80,92,51,66,70})); //
  }

    public static int findMaximumXOR(int[] nums) {
       int maxXOR = 0;
       for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
           maxXOR = Math.max(maxXOR, xor(nums[i], nums[j]));
         }
       }
       return maxXOR;
    }

    static int xor(int a, int b) {
      return a ^ b;
    }
}
