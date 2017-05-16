import java.util.Scanner;

public class EOFPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; scanner.hasNext(); i++) {
            String string = scanner.nextLine();
            System.out.println(i + " " + string);
        }
    }

}
