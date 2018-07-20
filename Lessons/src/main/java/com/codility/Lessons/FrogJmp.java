package com.codility.Lessons;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		if(((Y-X)%D)>0)
			return (Y-X)/D + 1;
		else
			return (Y-X)/D;
	}
		
}
