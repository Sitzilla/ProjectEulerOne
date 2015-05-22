package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
 */

@Solved
public class _003 extends Problem {

    public static void main(String[] args) {

        Problem p = new _003();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        boolean primeNumber = false;
        int largestPrime = 0;
        long l = 0;
        long max = (long) 600851475143.0;

        for (l = 2; l <= max; l++) {

            if (max % l == 0){
                long factor = (max / l);
                primeNumber = MathFunctions.isPrime(factor);
            }

            if (primeNumber == true) {
                long factor = (max / l);
                this.answer = factor;
                return;
            }
        }
    }
}
