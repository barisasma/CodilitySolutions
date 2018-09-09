package com.codility.Lessons;

import java.util.Arrays;

public class FrogRiverOne {

	public static int solution(int X, int[] A) {

		int[] temp = new int[X];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = -1;
		}

		for (int i = 0; i < A.length; i++) {
			if (temp[A[i] - 1] == -1)
				temp[A[i] - 1] = i;
		}
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == -1)
				return -1;
		}

		return temp[temp.length - 1];

	}

}
