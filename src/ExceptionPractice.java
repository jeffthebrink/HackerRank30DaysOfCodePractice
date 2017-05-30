import java.util.Scanner;

/**
 * Read a String input, parse it into an integer, and then print it. If that cannot be done,
 * print out "Bad String".
 */
public class ExceptionPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int someNumber = Integer.parseInt(scanner.next());
            System.out.println(someNumber);

        } catch (Exception e) {
            System.out.println("Bad String");
        }

    }
}
