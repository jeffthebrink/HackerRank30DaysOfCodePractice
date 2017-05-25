import java.util.*;
import java.util.Arrays;

/**
 * Created by jeffbrinkley on 5/25/17.
 */
public class AnagramExercise {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A, B);


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
