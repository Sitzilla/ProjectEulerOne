package com.evan.euler;
// A class of assorted math functions to be used in other Project Euler Classes


public class MathFunctions {

	public static boolean isPrime(long value){
		if (value < 2) {
			return false;
		}
		
		for (long i = (long) 2.0; i <= Math.sqrt(value);i++){
			if (value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
