import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateInString = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");
        try {
            Date date = formatter.parse(dateInString);
            DateFormat dayFormat = new SimpleDateFormat("EEEE");
            String dayFromDate = dayFormat.format(date).toUpperCase();
            System.out.println(dayFromDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
