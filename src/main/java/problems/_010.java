package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

@Solved
public class _010 extends Problem {

    public static void main(String[] args) {

        Problem p = new _010();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        long sum = 0;

        for (long i = 1; i < 2000000; i += 2) {
            if (MathFunctions.isPrime(i) == true){
                sum = sum + i;
            }
        }
        this.answer = (sum + 2);
    }
}
