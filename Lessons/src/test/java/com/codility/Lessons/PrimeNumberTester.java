package com.codility.Lessons;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTester {

	@Test
	public void test() {
		Assert.assertEquals(new int[10], PrimeGenerator.generatePrimes(10));
	}

}
