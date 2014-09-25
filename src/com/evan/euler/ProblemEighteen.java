package com.evan.euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProblemEighteen {

	static Integer[][] inputArrayList = new Integer[4][4]; //first is row/level, second is column/index.  Counting starts at 0
	StringBuilder calculatedPath = new StringBuilder();
	ArrayList<String> memoString = new ArrayList<String>();
	ArrayList<Integer> memoInt = new ArrayList<Integer>();
	
	public static void main(String args[]) throws IOException{
		long answer = 0;
		long startTime = System.currentTimeMillis();
		
		ProblemEighteen newAnswer = new ProblemEighteen();
		
		System.out.println(answer);
		
		//length of time for the program to run
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total runtime was: " + totalTime/1000 + " seconds.");
		
	}

	
	ProblemEighteen() throws IOException {
		long answer;
		readTextFile();
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
		
		calculatedPath.append(depth);
		calculatedPath.append(index);
		
		if (depth==0){ // || if the value is already known
//			memoString.add(calculatedPath.toString());
//			memoInt.add(inputArrayList[depth][index]);
			return inputArrayList[depth][index];
		}
		if (memoString.contains(calculatedPath)){
			int tempIndex;
			
			tempIndex = memoString.indexOf(calculatedPath);
			
			calculatedPath.delete(calculatedPath.length()-Integer.toString(index).length(),calculatedPath.length());
			calculatedPath.delete(calculatedPath.length()-Integer.toString(depth).length(),calculatedPath.length());
			
			return memoInt.get(tempIndex);
			
		}else{
		
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
			
			//return memo
			return valueBiggest;
			}
	}
	
	
	public long returnCalculatedPath(){
		
		
		
		
		
		
		
		
		
		return 0;
	}
	
	
	
	//=====code to put the text to variables=============
	public void readTextFile() throws IOException{
		ArrayList<String> list;
		
		list = redFileOfNumbers("C:/Users/esitzes/Documents/ProjectEuler/Euler67test.txt");
		
		
		
	}
	
	public ArrayList<String> redFileOfNumbers(String filepath) throws IOException{
		String line = null;
		ArrayList<String> listRaw = new ArrayList<String>();
		ArrayList<String> listOutput = new ArrayList<String>();
		int indexRow = 0;
		
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
	
		//adds each individual row in the input into ArrayList list
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(";");
			for (String part : parts) {
				listRaw.add(part);
			}
		}
		
		//takes each row and splits them into indexed numbers
		for (int i = 0; i < listRaw.size();i++){
			int  indexColumn = 0;
			String[] parts = listRaw.get(i).split(" ");
			for (String part : parts) {
				
				inputArrayList[indexRow][indexColumn] = Integer.parseInt(part);
				indexColumn += 1;
			}
			indexRow += 1;
			
		}
		
		
		
		return null;
		
		
	}
	
	
}
