package com.evan.euler;

public class ProblemTwentySeven  extends MathFunctions {

	public static void main(String args[]){
		long answer = 0;
		long startTime = System.currentTimeMillis();
		
		answer = ProblemTwentySeven();
		
		System.out.println(answer);
		
		//length of time for the program to run
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total runtime was: " + totalTime/1000 + " seconds.");
		
	}

	private static long ProblemTwentySeven() {
//		ArrayList<Double[][]> productList = new ArrayList<Double[][]>();
		long largestNumberOfPrimes = 0;
		long largestPrimeHoldingProduct = 0;
		
		for (long i = -999; i < 1000; i ++){
			for (long j = -999; j < 1000; j ++){
				long product = i * j;
				long answer;
				answer = consecutivePrimes(i, j);
				
				if (answer > largestNumberOfPrimes){
					largestNumberOfPrimes = answer;
					largestPrimeHoldingProduct = product;
				}

				
			}
		}
		
		
		
		
		return largestPrimeHoldingProduct;
	}
	private static long consecutivePrimes(long a, long b){
	//method that checks passed in double 
		long n = 0;
		long countOfPrimes = 0;
		boolean allPrime = true;
		long product = 0;
		
		while(allPrime){
			product = (long) ((Math.pow(n, 2))+(a*n)+b);
			if (isPrime(product)){
				countOfPrimes += 1;
			} else {
				allPrime = false;
			}
			n += 1;
		}
		return countOfPrimes;
	}
	
}
