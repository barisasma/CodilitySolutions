package com.codility.Lessons;

/*
 * Clean Code page 73
 */

public class PrimeGenerator {

	private static boolean[] crossedOut;
	private static int[] result;

	public static int[] generatePrimes(int maxValue) {

		if (maxValue < 2)
			return new int[0];
		else {
			uncrossedntegersUpTo(maxValue);
			return result;
		}

	}

	private static void uncrossedntegersUpTo(int maxValue) {
		crossedOut = new boolean[maxValue+1];
	}

}
