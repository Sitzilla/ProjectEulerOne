package com.evan.euler;

public class ProblemTwo {

	public static void main(String args[]) {
		int answer = 0;
		
		answer = ProblemTwo();
		
		System.out.println(answer);
	}
	
	public static int ProblemTwo(){
		int sum = 0;
		int tertiary = 0;
		int first = 1;
		int second = 2;
				
		
		
		while (second<4000000) {
			if (second%2==0) {
				sum += second;
			}
			tertiary = first;
			first = second;
			second += tertiary;
			
		}
		
		return sum;
	}
	
	
}
