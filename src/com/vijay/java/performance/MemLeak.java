package com.vijay.java.performance;

import java.util.Map;

public class MemLeak {
	public final String key;

	public MemLeak(String key) {
		this.key = key;
	}

	public static void main(String args[]) {
    try {
      Map map = System.getProperties();
      for(;;) {
         map.put(new MemLeak("key"), "value");
         System.out.println(map.size());
      }
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
}