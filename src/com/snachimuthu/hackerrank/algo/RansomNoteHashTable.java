package com.snachimuthu.hackerrank.algo;

import java.util.*;

public class RansomNoteHashTable {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public RansomNoteHashTable(String magazine, String note) {
		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		String[] magArr = magazine.split(" ");
		String[] noteArr = note.split(" ");
		for(String mag: magArr){
			magazineMap.put(mag,magazineMap.get(mag)==null? 0 : magazineMap.get(mag)+1);
		}
		for(String noteStr: noteArr){
			noteMap.put(noteStr,noteMap.get(noteStr)==null? 0 : noteMap.get(noteStr)+1);
		}
	}

	public boolean solve() {
		boolean isValid = false;
		for(String note: noteMap.keySet()){
			if(magazineMap.get(note) != null && magazineMap.get(note) >= (noteMap.get(note))){
				isValid = true;
			}else{
				return false;
			}
		}
		return isValid;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		RansomNoteHashTable s = new RansomNoteHashTable(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if(answer)
			System.out.println("Yes");
		else System.out.println("No");

	}
}

