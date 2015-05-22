package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

@Solved
public class _009 extends Problem {

    public static void main(String[] args) {

        Problem p = new _009();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        boolean sum = false;

        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                for (int c = 1; c < 1000; c++) {
                    if (MathFunctions.sumIsThousand(a,b,c) == true){
                        if (MathFunctions.isPythagoreanTriplet(a,b,c) == true){
                            this.answer = a * b * c;
                        }
                    }
                }
            }
        }
    }
}
