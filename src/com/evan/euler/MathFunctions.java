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
	
	//takes a string of numbers and returns an ArrayList of single integers
	public static List<Integer> addStringToArray(String stringOfNumbers){
		List<Integer> list = new ArrayList<Integer>();
		int stringLength = 0;
		
			
		stringLength = stringOfNumbers.length();
		
		for (int i=0; i<=stringLength-1;i++){
			StringBuilder strBuild = new StringBuilder();
			strBuild.append(stringOfNumbers.charAt(i));
			list.add(Integer.parseInt(strBuild.toString()));		
			}
		
		return list;
	}
	//takes a string of numbers and returns an ArrayList of 50 digit integers
	public static List<Long> addStringToArrayFiftyDigit(String stringOfNumbers){
		List<Long> list = new ArrayList<Long>();
		int stringLength = 0;
		StringBuilder strBuild = new StringBuilder();
			
		stringLength = stringOfNumbers.length();
		
		for (int i=0; i<=stringLength-1;i+=50){
			for (int j=0; j<=49; j++){
			
			strBuild.append(stringOfNumbers.charAt(j));
				
			}
			list.add(Long.parseLong(strBuild.toString()));	
		}
		return list;
	}
}
