package com.vijay.java.performance;

import java.util.Iterator;
import java.util.Map;

public class MemLeakFixed {
	public final String key;

	public MemLeakFixed(String key) {
		this.key = key;
	}

	public static void main(String args[]) {
    try {
      Map map = System.getProperties();
      for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
		String type = (String) iterator.next();
		System.out.println(type+"-"+map.get(type));
	}
      /*for(;;) {
         map.put(new MemLeakFixed("key"), "value");
         System.out.println(map.size());
      }*/
    } catch(Exception e) {
        e.printStackTrace();
    }
  }
	@Override
	public int hashCode() {
		return this.key.length()*13;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return (this.key!=null?this.key.equals(arg0):true);
	}
}