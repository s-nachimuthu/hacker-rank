package com.snachimuthu.hackerrank.algo;

public class ArithmeticSlice {
	
	public static void main(String[] args) {
		int[] A = {-1,1,3,3,3,2,1,0};
		System.out.println(new ArithmeticSlice().solution(A));
	}

    public int solution(int[] A) {
    	int count = 0;
        for(int i = 0;i<A.length ;i++) {
        	for(int j = i+1;j<A.length ;j++) {
        		if(isArithmetic(i,j,A) == true) {
        			System.out.println(i + ", " + j);
        			count ++;
        		}
        	}	
        }
        return count;
    }
    private boolean isArithmetic(int start,int end, int[] A) {
    	System.out.println("start="+start+":end="+end);
        if(end-start <= 1) return false;
        if((A[end] - A[end-1]) != (A[start+1] - A[start])) return false;
        for(int i=start;i< end-1 ;i++){
            if((A[i+1] - A[i]) != (A[end] - A[end-1]))
                return false;
        }
        return true;
    }
}