package com.vijay.java.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BitManuplitationLonelyInteger {

	public static int lonelyInteger(int[] a) {
		int unique = -999;
		HashMap tempMap = new HashMap();

		for (int i = 0; i < a.length; i++) {
			if (tempMap.get(a[i]) != null) {
				tempMap.put(a[i], ((int) tempMap.get(a[i]) + 1));

			} else {
				tempMap.put(a[i], 1);
			}
		}

		for (Iterator iterator = tempMap.keySet().iterator(); iterator
				.hasNext();) {
			int key = (int) iterator.next();
			if(((int)tempMap.get(key))<2){
				unique=key;
			}
			//System.out.println(key + " - " + tempMap.get(key));

		}
		//System.out.println(unique);
		return unique;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		System.out.println(lonelyInteger(a));
	}
}
