package main.java.lib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// A class of assorted math functions to be used in other Project Euler Classes


public class MathFunctions {

    //takes in a long, potentially repetative string and attempts to return the pattern
    public static String stringPattern(String value){
        String pattern = "";


        for (int i = 1; i < Math.sqrt(value.length());i++){
            StringBuilder strFirst = new StringBuilder("");
            StringBuilder strSecond = new StringBuilder("");
            StringBuilder strThird = new StringBuilder("");

            for (int j = 1; j < 1*i+1; j++){
                strFirst.append(value.charAt(j));
            }
            for (int j = 1*i+1; j < 2*i+1; j++){
                strSecond.append(value.charAt(j));
            }
            for (int j = 2*i+1; j < 3*i+1; j++){
                strThird.append(value.charAt(j));
            }
            if (strFirst.toString().equals(strSecond.toString())&& strFirst.toString().equals(strThird.toString())){
                return strFirst.toString();
            }

        }



        return "0";
    }

    // Returns whether a string is a palendrome
    public static boolean isPalendrome(String str) {
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

    //method that takes in an integer, and returns true if it is an abundant number
    //and returns false if it is not abundant
    public static boolean isAbundantNumber(final int value){
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        list = factorsOfNumber(value);

        //remove any duplicates from values that are perfect squares
        list = removeDuplicatesFromArrayList(list);

        //sums all of the values in the list
        sum = sumOfInts(list);

        //subtract out the initial value passed in
        sum -= value;

        // if the number is abundant return true
        if (sum > value){
            return true;
        }

        //else return false
        return false;
    }

    //checks if a number is divisible by a number 1-20, and if so return true
    public static boolean isDivisible(int check) {
        for (int i=1; i<=20; i++) {
            if (check%i!=0) {
                return false;
            }
        }
        return true;
    }

    // returns the sum of squares
    public static int sumOfSquares() {
        int sum = 0;
        for (int i=1;i<=100;i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    // returns the square of sums
    public static int squareOfSums() {
        int sum = 0;
        for (int i=1;i<=100;i++) {
            sum += i;
        }
        sum = sum*sum;
        return sum;
    }

    //returns true if sum of 3 numbers is 1000
    public static boolean sumIsThousand(int a, int b, int c){
        if (a+b+c==1000){
            return true;
        }
        return false;
    }

    //returns true if three numbers are a Pythagorean Triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        if ((a*a)+(b*b)==(c*c)){
            return true;
        }
        return false;
    }


    //takes an array of integers and removes any duplicate numbers
    public static List<Integer> removeDuplicatesFromArrayList(List<Integer> list){
        HashSet hs = new HashSet();

        hs.addAll(list);
        list.clear();
        list.addAll(hs);

        return list;
    }


    public static long consecutivePrimes(long a, long b){
        //method that checks passed in double
        long n = 0;
        long countOfPrimes = 0;
        boolean allPrime = true;
        long product = 0;

        while(allPrime){
            product = (long) ((Math.pow(n, 2))+(a*n)+b);
            if (isPrime(product)){
                countOfPrimes += 1;
            } else {
                allPrime = false;
            }
            n += 1;
        }
        return countOfPrimes;
    }

    //takes an arraylist of integers and returns their sum
    public static int sumOfInts(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }

    //takes in a number and lists out its factors (***allows repeat factors to exist!!!)
    public static List<Integer> factorsOfNumber(final int value){
        List<Integer> list = new ArrayList<Integer>();

        if (value==1){
            list.add(1);
            return list;
        }

        for (int i=1;i <= Math.sqrt(value);i++){
            if (value%i==0){
                list.add(i);
                list.add(value/i);
            }
        }

        return list;

    }

    public static boolean isPrime(long value){
        if (value < 2) {
            return false;
        }

        for (long i = (long) 2.0; i <= Math.sqrt(value);i++){
            if (value%i == 0) {
                return false;
            }
        }
        return true;
    }

    /*reads a file and returns a string ArrayList.  String is split into substrings based on ',' separating
     * each piece into an ArrayList
     */
    public static ArrayList<String> readsFileAsString(String file) throws IOException{
        String line = null;
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        //adds each individual name into ArrayList list
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            for (String part : parts) {
                list.add(part);
            }
        }


        return list;
    }

    /*reads a file and returns a string ArrayList.  Each line on the file is considered a different string
     */
    public static ArrayList<String> readsFileAsStringByLine(String file) throws IOException{
        String line = null;
        ArrayList<String> lines = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        //adds each individual name into ArrayList list
        while ((line = reader.readLine()) != null) {
            lines.add(line);

        }


        return lines;
    }


    //accepts an English character (upper or lower case) and returns an associated value 1-26
    public static int alphabeticalValueOfLetter(char character){
        int value = 0;

        switch (character){

            case 'a': case 'A': value = 1;
                break;
            case 'b': case 'B': value = 2;
                break;
            case 'c': case 'C': value = 3;
                break;
            case 'd': case 'D': value = 4;
                break;
            case 'e': case 'E': value = 5;
                break;
            case 'f': case 'F': value = 6;
                break;
            case 'g': case 'G': value = 7;
                break;
            case 'h': case 'H': value = 8;
                break;
            case 'i': case 'I': value = 9;
                break;
            case 'j': case 'J': value = 10;
                break;
            case 'k': case 'K': value = 11;
                break;
            case 'l': case 'L': value = 12;
                break;
            case 'm': case 'M': value = 13;
                break;
            case 'n': case 'N': value = 14;
                break;
            case 'o': case 'O': value = 15;
                break;
            case 'p': case 'P': value = 16;
                break;
            case 'q': case 'Q': value = 17;
                break;
            case 'r': case 'R': value = 18;
                break;
            case 's': case 'S': value = 19;
                break;
            case 't': case 'T': value = 20;
                break;
            case 'u': case 'U': value = 21;
                break;
            case 'v': case 'V': value = 22;
                break;
            case 'w': case 'W': value = 23;
                break;
            case 'x': case 'X': value = 24;
                break;
            case 'y': case 'Y': value = 25;
                break;
            case 'z': case 'Z': value = 26;
                break;
        }
        return value;
    }

    //takes a number and returns its factorial
    public static BigInteger numberFactorial(long i){
        BigInteger product = BigInteger.valueOf(1);

        for (int j=1; j<=i; j++){
            product = product.multiply(BigInteger.valueOf(j));

        }
        return product;
    }



    //recursive method that takes in an integer and returns the number of terms in that integer's Collatz Sequence
    public static long collatzSequence(long value, long loopCounter) {
        long answer = 0;

        if (value==1){
            return loopCounter;
        }
        if (value%2==0){
            value /= 2;
        } else {
            value = (3*value)+1;
        }
        loopCounter++;


        answer = collatzSequence(value, loopCounter);
        return answer;
    }



    //takes a string of numbers and returns an ArrayList of single integers
    public static List<Integer> addStringToArray(String stringOfNumbers){
        List<Integer> list = new ArrayList<Integer>();
        int stringLength = 0;


        stringLength = stringOfNumbers.length();

        for (int i=0; i<=stringLength-1;i++){
            StringBuilder strBuild = new StringBuilder();
            strBuild.append((stringOfNumbers).charAt(i));
            list.add(Integer.parseInt(strBuild.toString()));
        }

        return list;
    }
    //takes a string of numbers and returns an ArrayList of 50 digit integers
    public static List<Long> addStringToArrayFiftyDigit(String stringOfNumbers){
        List<Long> list = new ArrayList<Long>();
        int stringLength = 0;
        StringBuilder strBuild = new StringBuilder();

        stringLength = stringOfNumbers.length();

        for (int i=0; i<=stringLength-1;i+=50){
            for (int j=0; j<=49; j++){

                strBuild.append(stringOfNumbers.charAt(j));

            }
            list.add(Long.parseLong(strBuild.toString()));
        }
        return list;
    }

    public static int checksMultiples(int[][]  numberArray, int rowNumber, int columnNumber){
        int largestProduct = 0;
        int sum = 0;

        //checks vertical, horizontal, and diagonal
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber][columnNumber+1]*numberArray[rowNumber][columnNumber+2]*numberArray[rowNumber][columnNumber+3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber][columnNumber-1]*numberArray[rowNumber][columnNumber-2]*numberArray[rowNumber][columnNumber-3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber+1][columnNumber]*numberArray[rowNumber+2][columnNumber]*numberArray[rowNumber+3][columnNumber];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber-1][columnNumber]*numberArray[rowNumber-2][columnNumber]*numberArray[rowNumber-3][columnNumber];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber+1][columnNumber+1]*numberArray[rowNumber+2][columnNumber+2]*numberArray[rowNumber+3][columnNumber+3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber-1][columnNumber-1]*numberArray[rowNumber-2][columnNumber-2]*numberArray[rowNumber-3][columnNumber-3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber-1][columnNumber+1]*numberArray[rowNumber-2][columnNumber+2]*numberArray[rowNumber-3][columnNumber+3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            sum = numberArray[rowNumber][columnNumber]*numberArray[rowNumber+1][columnNumber-1]*numberArray[rowNumber+2][columnNumber-2]*numberArray[rowNumber+3][columnNumber-3];
            largestProduct = isLargest(sum,largestProduct);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        return largestProduct;
    }

    //returns the largest of two numbers
    public static int isLargest(int sum, int largestProduct){
        if (largestProduct<=sum){
            return sum;
        }
        return largestProduct;
    }

    //takes numbers out of a string array
    public static int findNumberInArray(int nextNumber){
        int returnNumber;
        StringBuilder strBuild = new StringBuilder();

        nextNumber*=3;

        String strNumbers = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";

        strBuild.append(strNumbers.charAt(nextNumber));
        strBuild.append(strNumbers.charAt(nextNumber+1));

        returnNumber = Integer.parseInt(strBuild.toString());

        return returnNumber;
    }
}
