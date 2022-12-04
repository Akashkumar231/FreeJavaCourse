import java.util.Locale;
import java.text.NumberFormat;
public class NumberFormatDemo2 {
    public static void main(String[] args) {

        Locale india  = new Locale("pa","in");
        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        System.out.println("The currency form of INDIA  is : " +nf1.format(123456.789));


        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("The currency form of U_S : " + nf2.format(123456.789));


        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("The currency form of U_K : " + nf3.format(123456.789));

    }
}
