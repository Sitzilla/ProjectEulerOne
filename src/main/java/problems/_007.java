package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */

@Solved
public class _007 extends Problem {

    public static void main(String[] args) {

        Problem p = new _007();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        boolean checkPrime;
        int counter = 0;
        int checkNumber = 1;

        while (counter <= 10001){
            checkPrime = false;
            checkPrime = MathFunctions.isPrime(checkNumber);
            if (checkPrime == true){
                counter += 1;
            }

            checkNumber += 1;
        }

        this.answer = checkNumber - 1;
    }
}
