package com.evan.euler;

import java.math.BigDecimal;

public class ProblemTwentySix extends MathFunctions{

	public static void main(String args[]){
		int answer = 0;
		
		answer = ProblemTwentySix();
		
		System.out.println(answer);
		System.exit(0); 
		
	}

	private static int ProblemTwentySix() {
		
		BigDecimal num = new BigDecimal("1");
		String biggestAnswer = "";
		int intDen = 0;
		
		for (int i = 2; i < 1001; i++){
			String answer = "";
			BigDecimal equals = new BigDecimal("0");
			BigDecimal den = new BigDecimal(i);
			
			
			try {
				num.divide(den);
			}
			catch(ArithmeticException aex) {
				//now need to find out how to identify a pattern here
				
				
				equals = num.divide(den, 150, BigDecimal.ROUND_HALF_UP);
				answer = stringPattern(equals.toString().substring(1));
				if (answer.length()>biggestAnswer.length()) {
					System.out.println(answer);
					biggestAnswer = answer;
					intDen = i;
				}
			}
			
		}
		
		
		return intDen;
	}

}
