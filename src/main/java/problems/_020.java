package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*n! means n � (n - 1) � ... � 3 � 2 � 1
For example, 10! = 10 � 9 � ... � 3 � 2 � 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
 */

@Solved
public class _020 extends Problem {

    public static void main(String[] args) {

        Problem p = new _020();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        // TODO Auto-generated method stub
        BigInteger answer = BigInteger.valueOf(0);
        String stringInt;
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        answer = MathFunctions.numberFactorial(100);

        stringInt = answer.toString();



        list = MathFunctions.addStringToArray(stringInt);

        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);

        this.answer = sum;
    }
}
