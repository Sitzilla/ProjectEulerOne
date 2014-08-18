package com.evan.euler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// A class of assorted math functions to be used in other Project Euler Classes


public class MathFunctions {

	//method that takes in an integer, and returns true if it is an abundant number
	//and returns false if it is not abundant
	public static boolean isAbundantNumber(final int value){
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		list = factorsOfNumber(value);
		
		//remove any duplicates from values that are perfect squares
		list = removeDuplicatesFromArrayList(list);
		
		//sums all of the values in the list
		sum = sumOfInts(list);
		
		//subtract out the initial value passed in
		sum -= value;
		
		// if the number is abundant return true
		if (sum > value){
			return true;
		}
		
		//else return false
		return false;
	}
	
	//takes an array of integers and removes any duplicate numbers
	public static List<Integer> removeDuplicatesFromArrayList(List<Integer> list){
		HashSet hs = new HashSet();
		
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
		
		return list;
	}
	
	//returns the larger of two numbers
			public static int isLargest(int sum, int largestProduct){
				if (largestProduct<=sum){
					return sum;
				}
					return largestProduct;
			}
			
	//takes an arraylist of integers and returns their sum
	public static int sumOfInts(List<Integer> list){
		int sum = 0;
		for (int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		return sum;
	}
	
	//takes in a number and lists out its factors (***allows repeat factors to exist!!!)
		public static List<Integer> factorsOfNumber(final int value){
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
	
/*reads a file and returns a string ArrayList.  String is split into substrings based on ',' separating
 * each piece into an ArrayList
 */
	public static ArrayList<String> readsFileAsString(String file) throws IOException{
		String line = null;
		ArrayList<String> list = new ArrayList<String>();
		
			BufferedReader reader = new BufferedReader(new FileReader(file));
	
		//adds each individual name into ArrayList list
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(",");
			for (String part : parts) {
			    list.add(part);
			}
		}

		
		return list;
	}
	
	/*reads a file and returns a string ArrayList.  Each line on the file is considered a different string
	 */
		public static ArrayList<String> readsFileAsStringByLine(String file) throws IOException{
			String line = null;
			ArrayList<String> lines = new ArrayList<String>();
			
				BufferedReader reader = new BufferedReader(new FileReader(file));
		
			//adds each individual name into ArrayList list
			while ((line = reader.readLine()) != null) {
				    lines.add(line);
				
			}

			
			return lines;
		}
	
	
	//accepts an English character (upper or lower case) and returns an associated value 1-26
	public static int alphabeticalValueOfLetter(char character){
		int value = 0;
		
		switch (character){
		
		case 'a': case 'A': value = 1;
		break;
		case 'b': case 'B': value = 2;
		break;					
		case 'c': case 'C': value = 3;
		break;
		case 'd': case 'D': value = 4;
		break;
		case 'e': case 'E': value = 5;
		break;
		case 'f': case 'F': value = 6;
		break;
		case 'g': case 'G': value = 7;
		break;
		case 'h': case 'H': value = 8;
		break;
		case 'i': case 'I': value = 9;
		break;
		case 'j': case 'J': value = 10;
		break;
		case 'k': case 'K': value = 11;
		break;
		case 'l': case 'L': value = 12;
		break;
		case 'm': case 'M': value = 13;
		break;
		case 'n': case 'N': value = 14;
		break;
		case 'o': case 'O': value = 15;
		break;
		case 'p': case 'P': value = 16;
		break;
		case 'q': case 'Q': value = 17;
		break;
		case 'r': case 'R': value = 18;
		break;
		case 's': case 'S': value = 19;
		break;
		case 't': case 'T': value = 20;
		break;
		case 'u': case 'U': value = 21;
		break;
		case 'v': case 'V': value = 22;
		break;
		case 'w': case 'W': value = 23;
		break;
		case 'x': case 'X': value = 24;
		break;
		case 'y': case 'Y': value = 25;
		break;
		case 'z': case 'Z': value = 26;
		break;
		}
		return value;
	}
	
	//takes a number and returns its factorial
	public static BigInteger numberFactorial(long i){
		BigInteger product = BigInteger.valueOf(1);
		
		for (int j=1; j<=i; j++){
			product = product.multiply(BigInteger.valueOf(j));
		
		}
		return product;
	}
	
	
	
	//recursive method that takes in an integer and returns the number of terms in that integer's Collatz Sequence
	public static long collatzSequence(long value, long loopCounter) {
		long answer = 0;
		
		if (value==1){
			return loopCounter;
		}
			if (value%2==0){
			value /= 2;
			} else {
			value = (3*value)+1;
			}
			loopCounter++;
			
			
			answer = collatzSequence(value, loopCounter);
			return answer;
		}
		
	
	
	//takes a string of numbers and returns an ArrayList of single integers
	public static List<Integer> addStringToArray(String stringOfNumbers){
		List<Integer> list = new ArrayList<Integer>();
		int stringLength = 0;
		
			
		stringLength = stringOfNumbers.length();
		
		for (int i=0; i<=stringLength-1;i++){
			StringBuilder strBuild = new StringBuilder();
			strBuild.append((stringOfNumbers).charAt(i));
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
