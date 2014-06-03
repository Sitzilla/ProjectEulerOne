package com.evan.euler;

import java.util.ArrayList;
import java.util.List;

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
	
	
	public static List<Integer> factorsOfNumber(int value){
		List<Integer> list = new ArrayList<Integer>();
		
		if (value==1){
			list.add(1);
			return list;
		}
		
			for (int i=1;i <= Math.sqrt(value);i++){
				if (value%i==0){
					list.add(i);
					list.add(value/i);
				}
			}
		
		return list;
		
	}
	
}
