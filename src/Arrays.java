import java.util.Scanner;
/**
 * Objective
 * Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Task
 * Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer,  (the size of our array).
 * The second line contains  space-separated integers describing array 's elements.
 * <p>
 * Constraints
 * <p>
 * , where  is the  integer in the array.
 * Output Format
 * <p>
 * Print the elements of array  in reverse order as a single line of space-separated numbers.
 */

public class Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int index = arraySize - 1; index <= arraySize; index--) {
            if (index > -1) {
                System.out.print(arr[index] + " ");
            }
        }
    }
}
