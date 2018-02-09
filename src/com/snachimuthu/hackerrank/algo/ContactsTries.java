package com.snachimuthu.hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContactsTries {


static void addContact(TriesNode n, String name) {
		for (int i = 0; i < name.length(); i++) {
			n = n.addChild(name.charAt(i), i == name.length() - 1);
			n.size++;
		}
	}

	static int findContact(TriesNode n, String name) {
		TriesNode child = null;
		for (int i = 0; i < name.length(); i++) {
			child = n.findChild(name.charAt(i));
			if (child == null) {
				return 0;
			} else {
				n = child;
			}
		}
		return n.size;
	}

	public static void main(String[] args) {
		TriesNode contacts = new TriesNode();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();
			if(op.charAt(0) == 'a') addContact(contacts, contact); 
			if(op.charAt(0)  == 'f') {
				int c = findContact(contacts, contact);
				System.out.println(c);
			}
		}
	}

}

class TriesNode {
	Map<Character, TriesNode> childrens = new HashMap<Character, TriesNode>();
	int size;

	TriesNode addChild(Character c, boolean isEnd) {
		TriesNode child = this.childrens.get(c);
		if (child == null) {
			child = new TriesNode();
			this.childrens.put(c, child);
		}
		return child;
	}

	TriesNode findChild(Character c) {
		return this.childrens.get(c);
	}
}