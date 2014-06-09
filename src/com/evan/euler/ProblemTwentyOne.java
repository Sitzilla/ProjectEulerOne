package com.evan.euler;

import java.util.ArrayList;
import java.util.List;

/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a not equals b, then a and b are an amicable pair and each of a and b are called amicable numbers.
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000.
 */

public class ProblemTwentyOne extends MathFunctions{

	public static void main(String args[]) {
		long answer = 0;
		
		answer = ProblemTwentyOne();
		
		System.out.println(answer);
	}

	private static long ProblemTwentyOne() {
		int answer = 0;
		
		for (int i=2; i<10000; i++){
		
			int input = i;
			int sumA = 0;
			int sumB = 0;
			List<Integer> list = new ArrayList<Integer>();
			
			list = factorsOfNumber(input);
			
			for (int j=0; j<list.size();j++) {
				sumA += list.get(j);
			}
			sumA -= input;
				
			//checks the sum of divisors for the original number
			list = factorsOfNumber(sumA);
			for (int k=0; k<list.size();k++) {
				sumB += list.get(k);
			}
			sumB -= sumA;
			
			//checks if d(a) = b and d(b) = a, where a not equal b
			
			if(input == sumB && sumA!=sumB){
				answer += input;
				
			}
		}
		
		
		
		return answer;
	}
	
}
