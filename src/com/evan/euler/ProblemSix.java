package com.evan.euler;

/*The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 minus 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class ProblemSix {
	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemSix();
		
		System.out.println(answer);
	}

	private static int ProblemSix() {
		int sumOfSquares;
		int squareOfSums;
		int total;
		
		sumOfSquares = sumOfSquares();
		squareOfSums = squareOfSums();
		
		total = squareOfSums-sumOfSquares;
		
		return total;
	}
	
	private static int sumOfSquares() {
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	private static int squareOfSums() {
		int sum = 0;
		for (int i=1;i<=100;i++) {
			sum += i;
		}
		sum = sum*sum;
		return sum;
	}
}
