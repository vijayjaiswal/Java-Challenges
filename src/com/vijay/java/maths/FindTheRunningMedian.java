package com.vijay.java.maths;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;

public class FindTheRunningMedian {
	static List<Integer> list = new ArrayList<Integer>();
	static PrintWriter writer = null;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			writer = new PrintWriter("output.txt", "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			findMedian(a[a_i]);
		}

		writer.close();
	}

	public static void findMedian(int a) {
		double median = 0;
		list.add(a);
		Collections.sort(list);
		// values=list.toArray();

		if ((list.size() % 2 != 0)) {
			double val = (double) list.size() / 2;
			int mid = (int) Math.ceil(val);

			// median =(Integer) values[mid - 1];
			median = (Integer) list.get(mid - 1);
		} else {
			double val = (double) list.size() / 2;
			int one = (int) Math.floor(val);
			--one;
			int two = one + 1;

			// double sum = (Integer)values[one]+ (Integer)values[two];
			double sum = (Integer) list.get(one) + (Integer) list.get(two);
			double val1 = (double) sum / 2;

			median = val1;

		}
		System.out.println(median);
		writer.println(median);
	}
}
