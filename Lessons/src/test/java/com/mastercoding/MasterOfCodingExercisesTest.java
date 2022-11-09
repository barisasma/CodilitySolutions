package com.mastercoding;

import org.junit.Test;

public class MasterOfCodingExercisesTest {

	int[] array1 = { 3, 4, 4, 1 };
	int sum = 8;
	String exStr = "My name is Baris";


	public void test() {
		System.out.println(MasterOfCodingExercises.solution(array1, sum));
	}
	
	

	public void test2() {
		System.out.println(MasterOfCodingExercises.reverseString(exStr));
	}
	
	
	@Test
	public void testFirstRepeatedInteger() {
		int[] firstArray = {2,5,1,2,3,5,1,2,4};
		int[] secondArray = {2,1,1,2,3,5,1,2,4};	
		int[] thirdArray = {2,3,4,5};
		System.out.println(MasterOfCodingExercises.firstRepeatedNumber(thirdArray));
	}

}
