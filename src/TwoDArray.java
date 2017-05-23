import java.util.Scanner;

/**
 * We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

 a b c
 d
 e f g
 There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

 Task
 Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

 Input Format

 There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

 Constraints

 Output Format

 Print the largest (maximum) hourglass sum found in A.
 */
public class TwoDArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int currentSum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (currentSum > max){
                    max = currentSum;
                }
            }
        }
        System.out.println(max);
    }
}
