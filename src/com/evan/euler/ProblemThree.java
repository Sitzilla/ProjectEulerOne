package com.evan.euler;

public class ProblemThree {

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
	
	public static boolean isPrime(long value){
		
		for (long i = (long) 2.0; i < value ;i++){
			if (value%i == 0) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
}
