import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // i is number of queries
        int i = scan.nextInt();


        for (int q = 0; q < i; q++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            //j is counter, n is exponent - really, they are the same here
            for (int j = 0; j < n; j++) {
                a = a + (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }

            System.out.println("");
        }
        scan.close();

    }
}