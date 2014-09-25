package com.evan.euler;

import java.util.ArrayList;

public class ProblemFifteen {
	int[] permArray = new int[20];
	int pathCount;
	ArrayList<String> arrayOfMoves = new ArrayList<String>();
	
	public static void main(String args[]) {
		
		ProblemFifteen newProblem = new ProblemFifteen();
		
		
	}

	public ProblemFifteen() {
		long answer = 0;
		pathCount = 1;
		
		for (int i = 0; i < 10; i++){
		permArray[i] = 1;
		}
		for (int i = 10; i < 20; i++){
			permArray[i] = 0;
			}
		
		
		
		
		permutation(0);
		
		System.out.println(pathCount);

	}

	public void permutation(int start){
		int range = ((permArray.length)/2);
		
		if (start<range){
			
		//does multi perms
		for (int i = start; i < range; i++){
			for (int j = range; j < (permArray.length); j++){
				
				if (permArray[i]==1 && permArray[j]==0){
					swap(i, j);
					StringBuilder strArray = new StringBuilder();
					for (int k=0; k < permArray.length; k++){
						strArray.append(permArray[k]);
					}
					if (!arrayOfMoves.contains(strArray.toString())){
						pathCount += 1;
						arrayOfMoves.add(strArray.toString());
					}
					
					permutation(i+1);
					swap(j, i);		
				}
				
			}
		}
		}
		
		
		
	}
	
	public void swap(int a, int b){
	int tempVariable;
	
	tempVariable = permArray[a];
	permArray[a] = permArray[b];
	permArray[b]= tempVariable;
	
	}
}
