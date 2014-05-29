package com.evan.euler;

public class ProblemOne {

	
	
	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemOne();
		
		System.out.println(answer);
	}
	
	public static int ProblemOne() {
		int sumTotal = 0;
		
		for (int i=1;i<1000;i++) {
			
			if (i%3 == 0) {
				sumTotal = sumTotal + i;
			}else if (i%5 == 0) {
				sumTotal = sumTotal + i;
			}
			
		}
		return sumTotal;
		
	}
}
