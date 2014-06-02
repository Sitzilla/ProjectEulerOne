package com.evan.euler;

/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */
public class ProblemThree extends MathFunctions{

	public static void main(String args[]) {
		long answer = 0;
		
		answer = ProblemThree();
		
		System.out.println(answer);
	}
	
	public static long ProblemThree(){
		boolean primeNumber = false;
		int largestPrime = 0;
		long l = 0;
		
		for (l = (long) 2.0; l<=600851475143.0; l++) {
				
			if (600851475143.0%l==0){
				long factor = (long) (600851475143.0/l);
				primeNumber = isPrime(factor);
			}
			
			if (primeNumber == true) {
				long factor = (long) (600851475143.0/l);
				return (factor);
			}

		}
		return 0;
	}
}
