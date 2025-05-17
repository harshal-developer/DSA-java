import javax.swing.text.html.HTMLDocument;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class payment_currency_formattter {
    private static Object India;

    public static void main(String[] args){
        double payment = 12324.134;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + usFormat.format(payment));

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs."); // Setting "Rs." as currency symbol
        symbols.setGroupingSeparator(','); // Comma as thousands separator
        symbols.setDecimalSeparator('.'); // Dot as decimal separator

        DecimalFormat indiaFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        indiaFormat.setDecimalFormatSymbols(symbols);
        System.out.println("India: " + indiaFormat.format(payment));

//        NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance();
//        new Locale("en", "IN");
//        System.out.println("INDIA: Rs." + IndiaFormat.format(payment));

        NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("CHINA: " + ChinaFormat.format(payment));

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("FRANCE: " + franceFormat.format(payment));

    }
}
