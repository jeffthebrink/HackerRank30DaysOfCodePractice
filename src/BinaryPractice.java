import java.util.Scanner;

/**
 *
 */
public class BinaryPractice {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int remainder;
        int s = 0;
        int conOnes = 0;

        while (n > 0) {
            remainder = n % 2;
            n = n / 2;
            if (remainder == 1) {
                s++;
                if (s >= conOnes)
                    conOnes = s;
            } else {
                s = 0;
            }
        }

        System.out.println(conOnes);
    }
}
