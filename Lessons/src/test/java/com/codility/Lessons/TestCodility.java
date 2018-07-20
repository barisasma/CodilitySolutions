package com.codility.Lessons;

import org.junit.Assert;
import org.junit.Test;



public class TestCodility {
	
	@Test
	public void testFrog() {
		Assert.assertSame("Wrong!", 3, FrogJmp.solution(10, 85, 30));
		Assert.assertSame("Wrong!", 2, FrogJmp.solution(10, 70, 30));

	}
	

}
