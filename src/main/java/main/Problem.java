package main.java.main;

/**
 * Created by esitzes on 5/21/2015.
 */
public abstract class Problem {

    protected Object answer;
    protected final long startTime = System.currentTimeMillis();
    private boolean solved; // allows me to mark a problem as incomplete

    public Problem(){
        solved = true;
    }

    public Object answer(){
        return answer;
    }

    public void printAnswer(){
        final long finishTime = System.currentTimeMillis();
        final long runTime = finishTime - startTime;
        System.out.println("Total execution time: " + (runTime / 1000.0) + " seconds.");
    }
    public abstract void run();

}
