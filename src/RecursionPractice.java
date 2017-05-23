/**
 * This exercise practices making three functions using recursion
 */
public class RecursionPractice {

    public static int Summation(int n) {
        // base case
        if (n <= 0) {
            return 0;
        }
        // recursive case
        else {
            return n + Summation(n - 1);
        }

    }

    public static int Factorial(int n) {
        // base case
        if (n <= 1) {
            return 1;
        }
        // recursive case
        else {
            return n * Factorial(n - 1);
        }
    }

    public static int Exponentiation(int n, int p) {
        // base
        if (p <= 0) {
            return 1;
        }
        // recursive case
        else {
            return n * Exponentiation(n, p - 1);
        }
    }


    public static void main(String[] args) {

        System.out.println(Summation(3));

        System.out.println(Factorial(4));

        System.out.println(Exponentiation(5, 4));

    }
}
