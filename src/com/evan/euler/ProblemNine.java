package com.evan.euler;

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class ProblemNine {
	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemNine();
		
		System.out.println(answer);
}

	private static int ProblemNine() {
		boolean sum = false;
		
		for (int a=1; a<1000;a++) {
			for (int b=1; b<1000;b++) {
				for (int c=1; c<1000;c++) {
					if (sumIsThousand(a,b,c)==true){
						if (isPythagoreanTriplet(a,b,c)==true){
							return a*b*c;
						}
					}
				}	
			}
		}
		return 0;
	}
	private static boolean sumIsThousand(int a, int b, int c){
		if (a+b+c==1000){
			return true;
		}
		return false;
	}
	
	
	private static boolean isPythagoreanTriplet(int a, int b, int c) {
		if ((a*a)+(b*b)==(c*c)){
			return true;
		}
		return false;
	}
	
}