package com.codility.Lessons;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	
	public static int solution(int[] A) {
		Set<Integer> intgers = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			intgers.add(A[i]);
		}
		return intgers.size();
	}

}
