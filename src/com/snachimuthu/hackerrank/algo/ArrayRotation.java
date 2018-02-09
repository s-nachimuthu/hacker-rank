package com.snachimuthu.hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		for(int i=0;i<k;i++){
			a = rotateOnce(a,n);

		} 
		return a;
	}
	static int[] rotateOnce(int[] a,int n){
		int  t = a[0];
		for(int i=n-1;i>=0;i--){
			int t1 = a[i];
			a[i] = t;
			t = t1;
		}             
		return a;
	}

	static void print(int[] a){
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for(int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}

