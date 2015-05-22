package main.java.problems;

import main.java.lib.MathFunctions;
import main.java.main.Problem;
import main.java.main.annotations.Solved;

import java.util.Calendar;


/*How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

@Solved
public class _019 extends Problem {

    public static void main(String[] args) {

        Problem p = new _019();
        p.run();

        p.printAnswer();
        System.out.println(p.answer());

    }

    public void run() {
        //sets Calendar c as 1 Jan 1901
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1901);
        c.set(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int sum = 0;

        while (c.get(Calendar.YEAR) <= 2000 && c.get(Calendar.MONTH) <= 11){


            dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

            if (dayOfWeek == 1) {
                sum++;
            }

            c.add(Calendar.MONTH, 1);
        }
        this.answer = sum;
    }
}
