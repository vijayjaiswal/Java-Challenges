package com.vijay.datastructure;

import java.util.Scanner;

/*
 * Sample Input
 * 6
 * 1 2 3 4 10 11
 * */
public class ArraySum {
	public static int total(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		System.out.print(total(arr));
	}
}
