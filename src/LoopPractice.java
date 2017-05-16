import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoopPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans;
        for (int i = 1; i <= 10; i++) {
            ans = i * n;
            System.out.println(n + " x " + i + " = " + ans);
        }


    }
}
