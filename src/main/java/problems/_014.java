package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
Which starting number, under one million, produces the longest chain?
 */

@Solved
public class _014 extends Problem {

    public static void main(String[] args) {

        Problem p = new _014();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        long answer = 0;
        long answerCount = 0;
        long largestNumber = 0;

        for (long i = 999999; i > 0; i--){

            largestNumber = MathFunctions.collatzSequence(i, 1);

            if (answerCount < largestNumber) {
                answerCount = largestNumber;
                answer = i;
            }



        }
        this.answer = answer;
    }
}
