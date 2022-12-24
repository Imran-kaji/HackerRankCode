import java.text.NumberFormat;
import java.util.*;
public class JavaCurrencyFormatter {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        double dbl = sc.nextFloat();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(dbl));
        System.out.println("India: " + india.format(dbl));
        System.out.println("China: " + china.format(dbl));
        System.out.println("France: " + france.format(dbl));
    }
}

// input
/*

54321

*/
