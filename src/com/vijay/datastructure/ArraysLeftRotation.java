package com.vijay.datastructure;

import java.util.Scanner;

/*
 *Sample Input
 * 5 4
 * 1 2 3 4 5
 */
public class ArraysLeftRotation {
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int i;
		for (i = 0; i < k; i++) {
			lRotateOne(a, n);
			
		}
		return a;
	}

	public static void lRotateOne(int inputArr[], int count) {
		int i, tempInt;
		tempInt = inputArr[0];
		for (i = 0; i < count-1 ; i++) {
			inputArr[i] = inputArr[i + 1];
		}
		inputArr[i] = tempInt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
