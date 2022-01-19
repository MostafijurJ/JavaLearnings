package com.learn.java.daily;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {3,3,4};
    int target = 6;
    int[] result = twoSum(nums, target);
    System.out.println(result[0] + " " + result[1]);
  }

  private static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

}
