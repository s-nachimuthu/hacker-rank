package com.snachimuthu.hackerrank.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        int n = expression.length();
        if(n % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i< n;i++){
            char c = expression.charAt(i);
            switch(c){
                case '{' : stack.push('}'); break;
                case '(' : stack.push(')'); break;
                case '[' : stack.push(']'); break;
                default:
                    if(stack.isEmpty() || stack.pop() != c){
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}