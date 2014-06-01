package com.evan.euler;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class ProblemFive {

	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemFive();
		
		System.out.println(answer);
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
