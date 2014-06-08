package com.evan.euler;

/*n! means n × (n - 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProblemTwenty extends MathFunctions{

	public static void main(String args[]) {
		long answer = 0;

		answer = ProblemTwenty();
		
		System.out.println(answer);
	}

	private static long ProblemTwenty() {
		// TODO Auto-generated method stub
		BigInteger answer = BigInteger.valueOf(0);
		String stringInt;
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		
		answer = numberFactorial(100);
		
		stringInt = answer.toString();
		
		
		
		list = addStringToArray(stringInt);
		
		for (int i=0; i<list.size();i++)
			sum += list.get(i);
		
		return sum;
	}
	
	
}
