import java.util.Locale;
import java.text.NumberFormat;
public class NumberFormatDemo1 {
    public static void main(String [] args){
        double d = 1234566.789;
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.ITALY);
        System.out.println("The Italy form is : " + nf.format(d));
    }
}
