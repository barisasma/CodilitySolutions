package com.codility.Lessons;

import java.util.Arrays;

public class PermMissingElem {
	
	public static int solution(int[] A) {
		int missing = 1;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (missing == A[i]) {
				missing++;
				continue;
			}
			return missing;
		}
		return missing;
	}
}
