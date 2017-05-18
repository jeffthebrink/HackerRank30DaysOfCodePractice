import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Given a string, find out the lexicographically smallest and largest substring of length .

 [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

 Input Format

 First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

 Output Format

 In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 */
public class StringCompare {


        public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.next();
            int lengthOfSub = scanner.nextInt();
            scanner.close();
            SortedSet<String> sets = new TreeSet<>();

            for(int i=0;i<=inputString.length()-lengthOfSub;i++){
                sets.add(inputString.substring(i,i+lengthOfSub));
            }

            System.out.println(sets.first());
            System.out.println(sets.last());
        }

}
