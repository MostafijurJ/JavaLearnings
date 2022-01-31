package com.learn.java.daily_challenges;

public class ValidMountain {

  public boolean validMountain(int[] arr) {
    if(arr.length < 3)
      return false;

    int startPillar = 0;
    int endPillar = arr.length - 1;

    while (startPillar+1 < arr.length -1 && arr[startPillar] < arr[startPillar+1]) {
      startPillar++;
    }

    while (endPillar-1 > 0 && arr[endPillar] < arr[endPillar-1]) {
      endPillar--;
    }

    return startPillar == endPillar && startPillar != 0 && endPillar != arr.length - 1;

  }

}
