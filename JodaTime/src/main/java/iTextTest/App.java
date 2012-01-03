package iTextTest;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class App
{
    public static void main( String[] args )
    {
        //Sat Feb 17 20:49:54 +0000 2007
        DateTimeFormatter fmt = DateTimeFormat.forPattern("EEE MMM dd H:m:s Z yyyy");
        DateTime dt = fmt.parseDateTime("Sat Feb 17 20:49:54 +0000 2007");
        MutableDateTime mdt = dt.toMutableDateTime();
        mdt.setYear(new DateTime().getYear());

        System.out.println(fmt.print(mdt));
    }
}
