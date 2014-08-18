package com.evan.euler;

/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class ProblemFour {

	public static void main(String args[]) {
		long answer = 0;
		boolean pally;
		
	//	pally = isPalendrome("12344488321	");
		
		answer = ProblemFour();
		
		System.out.println(answer);
	}

	private static long ProblemFour() {
		int product;
		int answer = 0;
		
		for (int baseline = 999; baseline>0; baseline--){
			
			for (int i = 999;i>0;i--){
				product = i*baseline;
				
				if (isPalendrome(Integer.toString(product))==true) {
					if (answer < product){
					answer = product;
					}
					break;
				}
			}
		}

	return answer;		

		}

	
	private static boolean isPalendrome(String str) {
		char first;
		char last;
		int numberOfTimes;
		numberOfTimes = str.length()/2;
		first = str.charAt(0);
		last = str.charAt(str.length()-1);
		
		if (first==last) {
			for (int i = 1; i<numberOfTimes; i++) {
				first = str.charAt(i);
				last = str.charAt(str.length()-(i+1));
				if (first!=last) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
