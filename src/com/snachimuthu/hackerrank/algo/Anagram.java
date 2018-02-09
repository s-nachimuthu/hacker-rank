package com.snachimuthu.hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {
	public static int numberNeeded(String first, String second) {
		Map<Character,Integer> map1 = returnCountMap(first);
		Map<Character,Integer> map2 = returnCountMap(second);

		int count = 0;
		for(Character c : map1.keySet()){
			if(map2.get(c) == null){
				count = count + map1.get(c);
			}else{
				count = count + Math.abs(map1.get(c) - map2.remove(c));
			}
		}
		for(Character c : map2.keySet()){
			count = count + map2.get(c);
		}
		return count;
	}

	static Map<Character,Integer> returnCountMap(String string) {
		Map<Character,Integer> countMap = new HashMap<Character,Integer>();
		for(int i=0;i<string.length();i++){
			char c = string.charAt(i);
			if(countMap.containsKey(c)){
				countMap.put(c,countMap.get(c)+1);
			}else{
				countMap.put(c,1);
			}
		}
		return countMap;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}