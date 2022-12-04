import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
public class DateFormatClassDemo3{

    public static void main(String[] args)
    {
        DateFormat df1  = DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
        System.out.println(df1.format(new Date()));
    }

}
