package com.snachimuthu.hackerrank.challenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

 	 static String super_reduced_string(String s){
	        String redString =s;
	        do{
	        	redString = reduceOnce(s);
	        	if(redString.equals(s)){
	        		break;
	        	}
	        	s = redString;
	        }while(true);
            if(redString.isEmpty()){
                return "Empty String";
            }
	        return redString;
	    }
	    
	    static String reduceOnce(String s) {
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i) == s.charAt(i+1)){
	                s = s.substring(0, i) + s.substring(i+2);
	                break;
	            }
	        }
	        return s;
	    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}