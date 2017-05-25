/**
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 * <p>
 * It's time to test your knowledge of Static initialization blocks. You can read about it here.
 * <p>
 * You are given a class SolutionPractice with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
 * <p>
 * If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 * <p>
 * Input Format
 * <p>
 * There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 */

import java.util.*;

public class Parallelogram {

    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag = true;

    static {
        try {
            if (B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
