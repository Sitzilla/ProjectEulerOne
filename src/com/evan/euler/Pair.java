package com.evan.euler;

//class that represents a combination of a String and an associated double.  These are meant to represent a pairing of file name and file size.
public class Pair {
	private String first;
	private long second;
	
	//initializes the 'Pair' object with a String 'first' value and a double 'second' value
	public Pair(String first, long second){
		this.first = first;
		this.second = second;
	}
	
	//returns the first value in the pair
	public String getFirst(){
		return first;
	}
	
	//returns the second value in the pair
	public long getSecond(){
		return second;
	}
	
	//adds a passed in value to the 'first' value in the object
	public void addFirst(String str){
		first = str;
	}
	
	//adds a passed in value to the 'second' value in the object
	public void addSecond(long dbl){
		second = dbl;
	}
	
	
}