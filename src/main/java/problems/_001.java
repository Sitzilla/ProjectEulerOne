package main.java.problems;

import main.java.main.Problem;
import  main.java.main.annotations.Solved;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

@Solved
public class _001 extends Problem {

    public static void main(String[] args) {

        Problem p = new _001();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        int sumTotal = 0;

        for (int i = 1; i < 1000; i++) {

            if (i%3 == 0) {
                sumTotal = sumTotal + i;
            }else if (i % 5 == 0) {
                sumTotal = sumTotal + i;
            }

        }
        this.answer = sumTotal;
    }
}
