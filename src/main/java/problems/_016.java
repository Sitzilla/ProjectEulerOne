package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
 */

@Solved
public class _016 extends Problem {

    public static void main(String[] args) {

        Problem p = new _016();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        BigInteger largeInt = BigInteger.valueOf(2);
        String stringInt;
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        largeInt = largeInt.pow(1000);

        stringInt = largeInt.toString();

        list = MathFunctions.addStringToArray(stringInt);

        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        this.answer = sum;
    }
}
