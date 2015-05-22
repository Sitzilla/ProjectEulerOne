package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

/*In the 20�20 grid below, four numbers along a diagonal line have been marked in red.
The product of these numbers is 26 � 63 � 78 � 14 = 1788696.
What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20�20 grid?
 */


@Solved
public class _011 extends Problem {

    public static void main(String[] args) {

        Problem p = new _011();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        int largestProduct = 0;
        int counter = 0;
        int[][]  numberArray  =  new int[20][20];


        //	findNumberInArray(4);

        //initialize array
        for (int j = 0; j <= 19; j++) {
            for (int i = 0; i <= 19; i++){
                numberArray[j][i] = MathFunctions.findNumberInArray(counter);
                counter++;
            }
        }
        counter=0;

        for (int j = 0; j <= 19; j++) {
            for (int i = 0; i <= 19; i++){
                largestProduct = MathFunctions.isLargest(MathFunctions.checksMultiples(numberArray, j, i),largestProduct);
                counter++;
            }
        }
        this.answer = largestProduct;
    }
}
