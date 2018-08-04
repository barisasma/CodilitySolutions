package com.codility.Lessons;

public class TapeEquilibrium {

	public static int solution(int[] A) {
		int sumLeft = A[0];
		int sumRight=0;
		int diff = 0;
		for (int i = 1; i < A.length; i++) {
			sumRight += A[i];
		}
		diff = Math.abs(sumLeft - sumRight);
		int i=1;
		while(i<A.length-1) {
			sumLeft +=  A[i];
			sumRight -= A[i];
			if(diff>Math.abs(sumLeft-sumRight)) {
				diff = Math.abs(sumLeft-sumRight);
			}
			i++;
		}
		return diff;
	}
	
}
