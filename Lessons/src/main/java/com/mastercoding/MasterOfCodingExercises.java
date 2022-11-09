package com.mastercoding;

import java.util.HashSet;
import java.util.Set;

public class MasterOfCodingExercises {
	
	public static boolean solution(int[] array1, int sum) {
		Set<Integer> complementNums = new HashSet<Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			if (complementNums.contains(array1[i])) {
				return true;
			}
			complementNums.add(sum-array1[i]);
		}
		return false;

	}
	
	public static char[] reverseString(String s) {
		char[] charArray = s.toCharArray();
		int lastIndex = charArray.length - 1;
		int beginIndex = 0;
		while (beginIndex < lastIndex) {
			char charFirst = charArray[beginIndex];
			char charEnd = charArray[lastIndex];
			charArray[beginIndex] = charEnd;
			charArray[lastIndex] = charFirst;
			beginIndex++;
			lastIndex--;
		}
		return charArray;
	}
	
	public static Integer firstRepeatedNumber(int[] array) {
		Set<Integer> uniqueNumber = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if(!uniqueNumber.contains(array[i])) {
				uniqueNumber.add(array[i]);
			} else {
				return array[i]; 
			}
		}
		return null;
	}

}
