import java.util.Scanner;

/**
 * Given a string A, print Yes if it is a palindrome, print No otherwise.

 Constraints

 A will consist at most 50 lower case english letters.
 */
public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();

        String newString = "";

        int constantLength = myString.length();
        int length = myString.length();
        int lengthMinusOne = myString.length() - 1;

        for (int counter = 1; counter <= constantLength; counter++){
            newString = newString + myString.substring(lengthMinusOne,length);
            length--;
            lengthMinusOne--;
        }

        if(myString.equals(newString)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
