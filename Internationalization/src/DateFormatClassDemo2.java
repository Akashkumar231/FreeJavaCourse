import java.util.Locale;
import java.text.DateFormat;
import java.util.Date;
public class DateFormatClassDemo2 {

    public static void main(String[] args) {

        DateFormat df1 = DateFormat.getDateInstance(0,Locale.US);
        System.out.println("The date format of US : " + df1.format(new Date()));

        DateFormat df2 = DateFormat.getDateInstance(0,Locale.UK);
        System.out.println("The date format of UK " + df2.format(new Date()));

        DateFormat df3  = DateFormat.getDateInstance(0,Locale.ITALY);
        System.out.println("The date Format of ITALY " + df3.format(new Date()));

    }

 }
