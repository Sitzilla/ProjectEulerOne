package com.evan.euler;

import java.util.ArrayList;


public class ProblemTwentyThree extends MathFunctions{
	public static void main(String args[]){
		int answer = 0;
		
		answer = ProblemTwentyThree();
		
		System.out.println(answer);
	}

	private static int ProblemTwentyThree() {
		int answer = 0;
		ArrayList<Integer> listOfAbundants= new ArrayList<Integer>();
		ArrayList<Integer> listOfSumOfAllAbundants= new ArrayList<Integer>();
		
		//make an arraylist of all abundant numbers between 1 and 28123 inclusive
		for (int i = 1; i < 28124; i++){
			if (isAbundantNumber(i)){
				listOfAbundants.add(i);
			}
		}
		
		//for all integers in arraylist listOfAbundants, add them to each other and include the sum
		//in arraylist listOfSumOfAllAbundants if: a. the sum is not already in the list, and 
		//b. if the sum is less than 28124(any number larger than 28123 is defined as the sum of two abundants, 
		//per the problem description)
		for (int i = 0; i < listOfAbundants.size();i++){
			outerloop:
			for (int j = 0; j < listOfAbundants.size();j++){
				int sum = listOfAbundants.get(i) + listOfAbundants.get(j);
					if (sum > 28123){
						break outerloop;
					}
					if (!listOfSumOfAllAbundants.contains(sum)) {
						listOfSumOfAllAbundants.add(sum);
					}
			}
		}
		
		//for all integers between 1 and 28123 (inclusive), if the number is NOT in the arraylist
		//listOfSumOfAllAbundants then add it to the answer
		for (int i = 1; i < 28124;i++){
			if (!listOfSumOfAllAbundants.contains(i)){
				answer += i;
			}
			
		}
	
		return answer;
	}
}
