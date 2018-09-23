package com.codility.Lessons;

import org.junit.Assert;
import org.junit.Test;

public class TestCodility {

	@Test
	public void testFrog() {

		Assert.assertSame("Wrong!", 3, FrogJmp.solution(10, 85, 30));
		Assert.assertSame("Wrong!", 2, FrogJmp.solution(10, 70, 30));
		Assert.assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, CyclicRotation.solution(new int[] { 3, 8, 9, 7, 6 }, 3));
		Assert.assertEquals(6, PermMissingElem.solution(new int[] { 1, 2, 3, 4, 5 }));
		Assert.assertEquals(4, PermMissingElem.solution(new int[] { 2, 3, 1, 5 }));
		Assert.assertEquals(20, TapeEquilibrium.solution(new int[] { -10, -20, -30, -40, 100 }));
		Assert.assertEquals(1, TapeEquilibrium.solution(new int[] { 3, 1, 2, 4, 3 }));
		Assert.assertEquals(0, PermCheck.solution(new int[] { 3, 1, 2, 4, 12 }));
		Assert.assertEquals(1, PermCheck.solution(new int[] { 1, 2, 3, 4, 5 }));
		Assert.assertEquals(4, FrogRiverOne.solution(4, new int[] { 1, 3, 1, 4, 2, 3, 4, 4 }));
		Assert.assertEquals(-1, FrogRiverOne.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 4, 4 }));
		Assert.assertEquals(3, Distinct.solution(new int[] { 2, 1, 1, 2, 3, 1 }));

	}

}
