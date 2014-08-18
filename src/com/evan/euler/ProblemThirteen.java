package com.evan.euler;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
/*
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers:
 */
import java.math.BigInteger;

public class ProblemThirteen extends MathFunctions{
	
	public static void main(String args[]) throws IOException {
		double answer = 0;
		
		answer = ProblemThirteen();
		
		System.out.println(answer);
	}

	private static double ProblemThirteen() throws IOException {
		ArrayList<String> listOfStrings = new ArrayList<String>();
		ArrayList<BigInteger> listOfNumbers = new ArrayList<BigInteger>();
		BigInteger sum = BigInteger.valueOf(0);
		
		listOfStrings = readsFileAsStringByLine("C:/Users/esitzes/Documents/ProjectEuler/ProblemThirteenInput.txt");
		
		for (int i = 0; i<listOfStrings.size();i++){
			String numbers = listOfStrings.get(i);
			BigInteger bigInt = BigInteger.valueOf(0);
			bigInt = bigInt.add(new BigInteger(numbers));
			
			sum = sum.add(bigInt);
			
		}
		
		System.out.println(sum);
		
		
		return 0;
	}
	
	
}
