package com.evan.euler;
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

@Solved
public class ProblemOne {

	public static void main(String args[]) {
        final long startTime = System.currentTimeMillis();
		int answer = 0;
		
		answer = ProblemOne();


        final long finishTime = System.currentTimeMillis();
        final long runTime = finishTime - startTime;

        System.out.println("Total execution time: " + runTime);
		System.out.println(answer);

	}
	
	public static int ProblemOne() {
		int sumTotal = 0;
		
		for (int i =1;i<1000;i++) {
			
			if (i%3 == 0) {
				sumTotal = sumTotal + i;
			}else if (i%5 == 0) {
				sumTotal = sumTotal + i;
			}
			
		}
		return sumTotal;
		
	}
}
