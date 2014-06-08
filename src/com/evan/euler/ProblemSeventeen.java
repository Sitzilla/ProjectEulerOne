package com.evan.euler;

public class ProblemSeventeen {

	public static void main(String args[]) {
		long answer = 0;

		answer = ProblemSeventeen();
		
		System.out.println(answer);
	}
	
	private static long ProblemSeventeen() {
		String value = "";
		int sum = 0;
		for (int i=1;i<=999;i++){
		
		value=numberWrittenAsWord(Integer.toString(i));
		
		value.replace(" ", "").trim();
		
		sum = sum + value.length();
		System.out.println(sum);
		}
		
		//for one thousand
		sum = sum + "onethousand".length();
		
		return sum;
	}

	
	
	
	private static String numberWrittenAsWord(String value){
		String numberString = "";
		//if the number is divisible by 100
		if (Integer.parseInt(value)%100 == 0) {
			numberString = hundredsStrings(value.substring(0,1));
		} 
		//if single digit
		else if (value.length()<=1){
			numberString = singlesStrings(value);
		}
		//if double digit less than 20
		else if (value.length()<=2 && Integer.parseInt(value)<20){
			numberString = singlesStrings(value);
		} 
		//if double digit between 20 and 99
		else if (value.length()<=2){
			numberString = tensStrings(value.substring(0,1));
			numberString += singlesStrings(value.substring(1));
		}
		//triple digit, second half less than 20
		else if ( Integer.parseInt(value.substring(1))<20){
			numberString = hundredsStrings(value.substring(0,1));
			numberString += "and";
			numberString += singlesStrings(value.substring(1));
		} 
		//triple digit, second half between 20 and 99
		else {
			numberString = hundredsStrings(value.substring(0,1));
			numberString += "and";
			numberString += tensStrings(value.substring(1,2));
			numberString += singlesStrings(value.substring(2));
		}
		
		System.out.println(numberString);
		
	return numberString;	
	}
	
	//returns 100,200,300,400,500,600,700,800,900
		private static String hundredsStrings(String value){
			String numberString = "";

			switch (value){
			
			case "1": numberString = "onehundred";
			break;
			case "2": numberString = "twohundred";
			break;
			case "3": numberString = "threehundred";
			break;
			case "4": numberString = "fourhundred";
			break;
			case "5": numberString = "fivehundred";
			break;
			case "6": numberString = "sixhundred";
			break;
			case "7": numberString = "sevenhundred";
			break;
			case "8": numberString = "eighthundred";
			break;
			case "9": numberString = "ninehundred";
			break;
			}
			return numberString;
		}
	
	//returns 10,20,30,40,50,60,70,80,90
	private static String tensStrings(String value){
		String numberString = "";

		switch (value){
		
		case "1": numberString = "ten";
		break;
		case "2": numberString = "twenty";
		break;
		case "3": numberString = "thirty";
		break;
		case "4": numberString = "forty";
		break;
		case "5": numberString = "fifty";
		break;
		case "6": numberString = "sixty";
		break;
		case "7": numberString = "seventy";
		break;
		case "8": numberString = "eighty";
		break;
		case "9": numberString = "ninety";
		break;
		}
		return numberString;
	}
	
		//returns the first numbers from 1-19
	private static String singlesStrings(String value){
		String numberString = "";

		switch (value){
		
		case "1": case "01": numberString = "one";
		break;
		case "2": case "02": numberString = "two";
		break;
		case "3": case "03": numberString = "three";
		break;
		case "4": case "04": numberString = "four";
		break;
		case "5": case "05": numberString = "five";
		break;
		case "6": case "06": numberString = "six";
		break;
		case "7": case "07": numberString = "seven";
		break;
		case "8": case "08": numberString = "eight";
		break;
		case "9": case "09": numberString = "nine";
		break;
		case "10": numberString = "ten";
		break;
		case "11": numberString = "eleven";
		break;
		case "12": numberString = "twelve";
		break;
		case "13": numberString = "thirteen";
		break;
		case "14": numberString = "fourteen";
		break;
		case "15": numberString = "fifteen";
		break;
		case "16": numberString = "sixteen";
		break;
		case "17": numberString = "seventeen";
		break;
		case "18": numberString = "eighteen";
		break;
		case "19": numberString = "nineteen";
		break;
		
		}
	return numberString;
	}
}


