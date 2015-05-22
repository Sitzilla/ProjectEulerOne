package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

@Solved
public class _004 extends Problem {

    public static void main(String[] args) {

        Problem p = new _004();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        int product;
        int answer = 0;

        for (int baseline = 999; baseline > 0; baseline--){

            for (int i = 999; i > 0; i--){
                product = i * baseline;

                if (MathFunctions.isPalendrome(Integer.toString(product))==true) {
                    if (answer < product){
                        answer = product;
                    }
                    break;
                }
            }
        }

        this.answer = answer;
    }
}
