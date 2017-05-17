import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Locale usLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale inLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale cnLocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale frLocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(inLocale);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(cnLocale);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(frLocale);

        double currency = scanner.nextDouble();

        String us = usFormat.format(currency);
        String in = inFormat.format(currency);
        String cn = cnFormat.format(currency);
        String fr = frFormat.format(currency);

        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + cn);
        System.out.println("France: " + fr);

        scanner.close();

    }
}
