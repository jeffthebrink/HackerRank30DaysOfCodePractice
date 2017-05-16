import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOne {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int x;
        double y;
        String z;

        /* Read and save an integer, double, and String to your variables.*/
        System.out.println("Enter an integer: ");
        x = scan.nextInt();
        System.out.println("Enter a double: ");
        y = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter a string: ");
        z = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(x + i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + y);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + z);

        scan.close();
    }
}