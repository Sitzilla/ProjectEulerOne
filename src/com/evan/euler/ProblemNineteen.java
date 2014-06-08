package com.evan.euler;

import java.util.Calendar;

/*How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

public class ProblemNineteen {

	public static void main(String args[]) {
		long answer = 0;

		answer = ProblemNineteen();
		
		System.out.println(answer);
	}

	private static long ProblemNineteen() {
		
		//sets Calendar c as 1 Jan 1901
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1901);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int sum = 0;
		
		while (c.get(Calendar.YEAR)<=2000 && c.get(Calendar.MONTH)<=11){
		
			
		dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
			if (dayOfWeek == 1) {
				sum++;
			}
		
		System.out.println(dayOfWeek);
		c.add(Calendar.MONTH, 1);
		
		}
		
		return sum;
	}
	
}
