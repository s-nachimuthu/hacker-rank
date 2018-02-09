package com.snachimuthu.hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSort {
	
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int swaps = bubbleSort(a);
        System.out.println( "Array is sorted in "+swaps+" swaps.");
        System.out.println( "First Element: "+a[0]);
        System.out.println( "Last Element: "+a[n-1]);
    }
    
    static int bubbleSort(int[] a){
    	int totalSwaps = 0;
    	int swaps= -1;
    	do {
    		swaps = sortOnce(a);
    		totalSwaps += swaps;
		} while (swaps != 0);
 
    	return totalSwaps;
    }
    static int sortOnce(int[] a){
    	int swaps = 0;
       	for (int i = 0; i < a.length-1; i++) {
			if(a[i] > a[i+1]){
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				swaps++;
			}
		}
       	return swaps;
    }
 }