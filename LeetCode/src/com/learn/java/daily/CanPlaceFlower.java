package com.learn.java.daily;

public class CanPlaceFlower {
  public static void main(String[] args) {
    int[] flowerbed = {1, 0, 0, 0, 1};
    int n = 1;
    System.out.println(canPlaceFlower(flowerbed, n));
  }

  private static boolean canPlaceFlower(int[] flowerbed, int n) {
    int count = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        if (i == 0) {
          if (flowerbed[i + 1] == 0) {
            count++;
          }
        } else if (i == flowerbed.length - 1) {
          if (flowerbed[i - 1] == 0) {
            count++;
          }
        } else {
          if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
            count++;
          }
        }
      }
    }
    return count >= n;
  }
}
