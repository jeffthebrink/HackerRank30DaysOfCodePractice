import java.io.*;
import java.util.*;

public class Algo1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named SolutionPractice. */

        Scanner scanner = new Scanner(System.in);

       // System.out.println("Enter the number of elements to add: ");
        int x = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < x; i++) {
        //    System.out.println("Enter element: ");
            int y = scanner.nextInt();
            sum = sum + y;
        }
        System.out.println(sum);

    }
}