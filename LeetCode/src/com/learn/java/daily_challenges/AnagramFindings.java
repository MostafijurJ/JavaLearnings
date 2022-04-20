package com.learn.java.daily_challenges;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class AnagramFindings {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> ans = new java.util.ArrayList<>();

    if(s.matches(p)){
      ans.add(0);
    }

    if(s.contains(p)){
      ans.add(s.indexOf(p));
    }
    return ans;
  }
}
