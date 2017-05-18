import java.util.Scanner;

/**
 * Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

 Input Format

 The first line contains a single string denoting .
 The second line contains two space-separated integers denoting the respective values of  and .

 Constraints

 String  consists of English alphabetic letters (i.e., ) only.
 Output Format

 Print the substring in the inclusive range from  to .
 */
public class SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String newString = scanner.next();

        scanner.nextLine();

        int startSub = scanner.nextInt();
        int endSub = scanner.nextInt();

        System.out.print(newString.substring(startSub, endSub));


    }

}
