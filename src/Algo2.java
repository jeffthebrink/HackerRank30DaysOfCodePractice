import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Algo2 {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int [] answerArray = new int [2];
        if (a0 > b0) {
            answerArray[0]++;
        } else if(a0 < b0){
            answerArray[1]++;
        } if (a1 > b1) {
            answerArray[0]++;
        } else if(a1 < b1){
            answerArray[1]++;
        } if (a2 > b2) {
            answerArray[0]++;
        } else if(a2 < b2){
            answerArray[1]++;
        }
      //  System.out.println("Array a points: " + answerArray[0] + " Array b points: " + answerArray[1]);
        return answerArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  System.out.println("Enter your 3 elements for a: ");
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
     //   System.out.println("Enter your 3 elements for b: ");
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
