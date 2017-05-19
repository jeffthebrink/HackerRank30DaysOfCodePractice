import java.util.Scanner;

/**
 * Consider a staircase of size :

    #
   ##
  ###
 ####
 Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

 Write a program that prints a staircase of size .

 Input Format

 A single integer, , denoting the size of the staircase.

 Output Format

 Print a staircase of size  using # symbols and spaces.

 Note: The last line must have  spaces in it.
 */
public class Staircase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int stairHeight = scanner.nextInt();

        for (int i = 1; i <= stairHeight; i++) {
            int space = stairHeight - i;
            for (int counter = 1; counter <= space; counter++) {
                System.out.print(" ");
            }
            for (int counter = 1; counter <= i; counter++) {
                System.out.print("#");
            }
            if (i < stairHeight) {
                System.out.println();
            }
        }
    }
}