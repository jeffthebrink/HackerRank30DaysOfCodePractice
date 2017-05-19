import java.util.HashMap;
import java.util.Scanner;

/**
 *Task
 Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

 Note: Your phone book should be a Dictionary/Map/HashMap data structure.

 Input Format

 The first line contains an integer, , denoting the number of entries in the phone book.
 Each of the  subsequent lines describes an entry in the form of  space-separated values on a single line. The first value is a friend's name, and the second value is an -digit phone number.

 After the  lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a  to look up, and you must continue reading lines until there is no more input.

 Note: Names consist of lowercase English alphabetic letters and are first names only.

 Constraints

 Output Format

 On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full  and  in the format name=phoneNumber.
 */
public class MapExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phoneList = new HashMap<>();
        int numOfEntries = scanner.nextInt();

        for (int counter = 1; counter <= numOfEntries; counter++) {
            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneList.put(name, phoneNumber);
        }

        for (int counter = 1; counter <= numOfEntries; counter++) {
            scanner.nextLine();
            String query = scanner.next();
            if (phoneList.get(query) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(query + "=" + phoneList.get(query));
            }
        }

        scanner.close();
    }

}
