package com.learn.java.daily;

public class KokoEatingBananas {
  public static void main(String[] args) {
    System.out.println(new KokoEatingBananas().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
  }

  public int minEatingSpeed(int[] piles, int h) {
    int lo = 1;
    int hi = 100000;
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (canEat(piles, h, mid)) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }
    return lo;
  }

  private boolean canEat(int[] piles, int h, int mid) {
    int sum = 0;
    for (int pile : piles) {
      sum += pile / mid;
      if (pile % mid != 0) {
        sum++;
      }
    }
    return sum <= h;
  }

}
