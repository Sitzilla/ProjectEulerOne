package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

/*
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers:
 */


@Solved
public class _013 extends Problem {

    public static void main(String[] args) {

        Problem p = new _013();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<BigInteger> listOfNumbers = new ArrayList<BigInteger>();
        BigInteger sum = BigInteger.valueOf(0);

        try {
            listOfStrings = MathFunctions.readsFileAsStringByLine("C:/Users/esitzes/Documents/ProjectEuler/ProblemThirteenInput.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < listOfStrings.size(); i++){
            String numbers = listOfStrings.get(i);
            BigInteger bigInt = BigInteger.valueOf(0);
            bigInt = bigInt.add(new BigInteger(numbers));

            sum = sum.add(bigInt);

        }
        this.answer = sum;
    }
}
