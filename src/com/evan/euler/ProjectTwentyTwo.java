package com.evan.euler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectTwentyTwo extends MathFunctions{
	
	public static void main(String args[]) throws IOException {
		long answer = 0;
		
		answer = ProblemTwentyTwo();
		
		System.out.println(answer);
	}

	private static long ProblemTwentyTwo() throws IOException {
		String answer;
		ArrayList<String> list = new ArrayList<String>();
		int sum = 0;
		long product = 0;
		
		list = readsFileAsString("C:/Users/esitzes/Documents/names.txt");
		
		Collections.sort(list);
		
		for (int i=0; i<list.size();i++){
			for (int j=1; j<list.get(i).length()-1;j++){
				
				sum += alphabeticalValueOfLetter(list.get(i).charAt(j));
				
			}
			
			product += sum*(i+1);
			sum = 0;
		}
		
		
		return product;
	}


	
}
