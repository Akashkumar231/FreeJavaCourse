import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DateFormat;
public class DateFormatClassDemo1 {
    public static void main(String [] args){
        DateFormat df1 = DateFormat.getDateInstance(0,Locale.US);
        System.out.println(df1.format(new Date()));
        DateFormat df2 = DateFormat.getDateInstance(1,Locale.US);
        System.out.println(df2.format(new Date()));
        DateFormat df3 = DateFormat.getDateInstance(2,Locale.US);
        System.out.println(df3.format(new Date()));
        DateFormat df4 = DateFormat.getDateInstance(3,Locale.US);
        System.out.println(df4.format(new Date()));

    }
}
