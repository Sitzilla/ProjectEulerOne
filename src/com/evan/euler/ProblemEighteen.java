package com.evan.euler;

import java.util.ArrayList;

public class ProblemEighteen {

	static Integer[][] inputArrayList = new Integer[4][4]; //first is row/level, second is column/index.  Counting starts at 0
	
	public static void main(String args[]){
		long answer = 0;
		long startTime = System.currentTimeMillis();
		
		ProblemEighteen newAnswer = new ProblemEighteen();
		
//		answer = solveProblem();
		
		System.out.println(answer);
		
		//length of time for the program to run
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total runtime was: " + totalTime/1000 + " seconds.");
		
	}

	
	ProblemEighteen() {
		long answer;
		inputArrayList[0][0] = 3;
		inputArrayList[1][0] = 7;
		inputArrayList[1][1] = 4;
		inputArrayList[2][0] = 2;
		inputArrayList[2][1] = 4;
		inputArrayList[2][2] = 6;
		inputArrayList[3][0] = 8;
		inputArrayList[3][1] = 5;
		inputArrayList[3][2] = 9;
		inputArrayList[3][3] = 3;
		answer = solveProblem();
		
		System.out.println("Largest Path: " + answer);
	}
	
	public long solveProblem(){
	long maxPath = 0;	
	long currentPath;
	for (int i = 0; i < 4; i++){
		currentPath = recursiveAddition(3, i);
		
		if (currentPath>maxPath){
			maxPath = currentPath;
		}
	}
		return maxPath;
		
	}
	
	
	public long recursiveAddition(int depth, int index) {
		long valueLeft=0;
		long valueRight=0;
		long valueBiggest;
		
		if (depth==0){ // || if the value is already known
			return 3;
		}
		
		if (index!=0){
			valueLeft = recursiveAddition(depth-1, index-1);
		}
		if (index!=depth){
		valueRight = recursiveAddition(depth-1, index);
		}
		if (valueLeft>valueRight){
			valueBiggest = valueLeft;
		} else{ 
			valueBiggest = valueRight;
		}
		
		valueBiggest += inputArrayList[depth][index];
		
		return valueBiggest;
	}
	
	public void readTextFile(){
		ArrayList<String> list = new ArrayList<String>();
		
		list = readsFileAsString("C:/Users/esitzes/Documents/names.txt");
		
		
		
	}
	
	
	
}
