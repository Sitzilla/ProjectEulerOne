package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.
What is the total of all the name scores in the file?
 */

@Solved
public class _022 extends Problem {

    public static void main(String[] args) {

        Problem p = new _022();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        String answer;
        ArrayList<String> list = new ArrayList<String>();
        int sum = 0;
        long product = 0;

        try {
            list = MathFunctions.readsFileAsString("C:/Users/esitzes/Documents/names.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++){
            for (int j = 1; j < list.get(i).length() - 1; j++){
                sum += MathFunctions.alphabeticalValueOfLetter(list.get(i).charAt(j));
            }
            product += sum * (i + 1);
            sum = 0;
        }
        this.answer = product;
    }
}
