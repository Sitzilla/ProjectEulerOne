package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 minus 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

@Solved
public class _006 extends Problem {

    public static void main(String[] args) {

        Problem p = new _006();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        int sumOfSquares;
        int squareOfSums;
        int total;

        sumOfSquares = MathFunctions.sumOfSquares();
        squareOfSums = MathFunctions.squareOfSums();

        total = squareOfSums - sumOfSquares;

        this.answer = total;
    }
}
