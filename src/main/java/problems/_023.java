package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.util.ArrayList;

/* Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?
 */

@Solved
public class _023 extends Problem {

    public static void main(String[] args) {

        Problem p = new _023();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        int answer = 0;
        ArrayList<Integer> listOfAbundants= new ArrayList<Integer>();
        ArrayList<Integer> listOfSumOfAllAbundants= new ArrayList<Integer>();

        //make an arraylist of all abundant numbers between 1 and 28123 inclusive
        for (int i = 1; i < 28124; i++){
            if (MathFunctions.isAbundantNumber(i)){
                listOfAbundants.add(i);
            }
        }

        //for all integers in arraylist listOfAbundants, add them to each other and include the sum
        //in arraylist listOfSumOfAllAbundants if: a. the sum is not already in the list, and
        //b. if the sum is less than 28124(any number larger than 28123 is defined as the sum of two abundants,
        //per the problem description)
        for (int i = 0; i < listOfAbundants.size(); i++){
            outerloop:
            for (int j = 0; j < listOfAbundants.size(); j++){
                int sum = listOfAbundants.get(i) + listOfAbundants.get(j);
                if (sum > 28123){
                    break outerloop;
                }
                if (!listOfSumOfAllAbundants.contains(sum)) {
                    listOfSumOfAllAbundants.add(sum);
                }
            }
        }

        //for all integers between 1 and 28123 (inclusive), if the number is NOT in the arraylist
        //listOfSumOfAllAbundants then add it to the answer
        for (int i = 1; i < 28124; i++){
            if (!listOfSumOfAllAbundants.contains(i)){
                answer += i;
            }

        }

        this.answer = answer;
    }
}
