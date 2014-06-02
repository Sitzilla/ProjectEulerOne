package com.evan.euler;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */

public class ProblemSeven extends ProblemThree{
	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemSeven();
		
		System.out.println(answer);
	
}

	private static int ProblemSeven() {
		boolean checkPrime;
		int counter = 0;
		int checkNumber = 1;
		
		while (counter<=10001){
		checkPrime = false;
		checkPrime = isPrime(checkNumber);
		if (checkPrime == true){
			counter += 1;
			}
		
		checkNumber += 1;
		}
		
		return checkNumber-1;
	}
}