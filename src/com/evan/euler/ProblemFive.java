package com.evan.euler;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class ProblemFive {

	public static void main(String args[]) {
		int answer = 0;
		long startTime = System.currentTimeMillis();
		
		answer = ProblemFive();
		
		System.out.println(answer);
		
		//length of time for the program to run
				long endTime   = System.currentTimeMillis();
				float totalTime = endTime - startTime;
				System.out.println("Total runtime was: " + totalTime/1000 + " seconds.");
	}

	private static int ProblemFive() {
		boolean check = false;
		int inc = 1;
		
		while (check==false){
			check = isDivisable(inc);
			inc += 1;
		}
		
		return inc-1;
	}
	
	private static boolean isDivisable(int check) {
		
		for (int i=1; i<=20; i++) {
			if (check%i!=0) {
				return false;
			}
			
		}
		
		return true;
		
		
	}
	
}
