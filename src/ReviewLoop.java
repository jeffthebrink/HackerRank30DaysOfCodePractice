import java.util.Scanner;

public class ReviewLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCases = scanner.nextInt();
        scanner.nextLine();

        for (int caseCounter = 1; caseCounter <= numberOfCases; caseCounter++) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                int evenIndex = 0;
                for (int evenCounter = 1; evenCounter <= word.length(); evenCounter++) {
                    if (evenIndex <= word.length() - 1) {
                        System.out.print(word.charAt(evenIndex));
                    }
                    evenIndex = evenIndex + 2;
                }

                System.out.print(" ");

                int oddIndex = 1;
                for (int oddCounter = 1; oddCounter <= word.length(); oddCounter++) {
                    if (oddIndex <= word.length() - 1) {
                        System.out.print(word.charAt(oddIndex));
                    }
                    oddIndex = oddIndex + 2;
                }
                System.out.println();
            }
        }
    } // end of psvm
}


