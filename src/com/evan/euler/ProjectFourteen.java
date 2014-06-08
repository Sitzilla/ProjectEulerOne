package com.evan.euler;

/*
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
 */

public class ProjectFourteen extends MathFunctions{
	
	public static void main(String args[]) {
		long answer = 0;
		
		
		answer = ProblemFourteen();
		
		System.out.println(answer);
	}

	private static long ProblemFourteen() {
		long answer = 0;
		long answerCount = 0;
		long largestNumber = 0;
		
		for (long i=999999;i>0;i--){
		
			largestNumber = collatzSequence(i, 1);
		
			if (answerCount<largestNumber) {
				answerCount = largestNumber;
				answer = i;
			}
		
		
		
		}
		return answer;
	}
}