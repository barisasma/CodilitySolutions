package com.codility.Lessons;

public class PermCheck {
	
	public static int solution(int[] A) {
		int[] temp = new int[A.length];
		for (int i = 0;  i < A.length; i++) {
			if(A[i]-1<temp.length)
				temp[A[i]-1]++;
		}
		
		for (int i = 0; i < temp.length; i++) {
			if(temp[i]==0)
				return 0;
		}
		return 1;
	}
	

}
