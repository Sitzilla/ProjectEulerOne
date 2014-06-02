package com.evan.euler;

/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

public class ProblemTen extends MathFunctions{
	public static void main(String args[]) {
		long answer = 0;
		
		answer = ProblemTen();
		
		System.out.println(answer);
	}

	private static long ProblemTen() {
		long sum = 0;
		
		for (long i=1; i<2000000; i+=2) {
			if (isPrime(i)==true){
				sum = sum+i;
			}
		}
		return (sum+2);
	}
}