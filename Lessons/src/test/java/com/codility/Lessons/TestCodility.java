package com.codility.Lessons;

import org.junit.Assert;
import org.junit.Test;



public class TestCodility {
	
	@Test
	public void testFrog() {
		Assert.assertSame("Wrong!", 3, FrogJmp.solution(10, 85, 30));
		Assert.assertSame("Wrong!", 2, FrogJmp.solution(10, 70, 30));
		Assert.assertArrayEquals(new int[]{9, 7, 6, 3, 8}, CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 3));
		Assert.assertEquals(6, PermMissingElem.solution(new int[] {1,2,3,4,5}));
		Assert.assertEquals(4, PermMissingElem.solution(new int[] {2,3,1,5}));
		
	}
	

}
