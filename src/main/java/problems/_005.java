package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

@Solved
public class _005 extends Problem {

    public static void main(String[] args) {

        Problem p = new _005();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        boolean check = false;
        int inc = 1;

        while (check == false){
            check = MathFunctions.isDivisible(inc);
            inc += 1;
        }

        this.answer = inc - 1;
    }
}
