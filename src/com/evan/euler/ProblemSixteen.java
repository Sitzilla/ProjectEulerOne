package com.evan.euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProblemSixteen extends MathFunctions{

	public static void main(String args[]) {
		long answer = 0;
		
		answer = ProblemSixteen();
		
		System.out.println(answer);
	}

	private static long ProblemSixteen() {
		BigInteger largeInt = BigInteger.valueOf(2);
		String stringInt;
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		largeInt = largeInt.pow(1000);
		
		stringInt = largeInt.toString();
		
		list = addStringToArray(stringInt);
		
		for (int i=0; i<list.size();i++)
			sum += list.get(i);
		
		return sum;
	}

}
