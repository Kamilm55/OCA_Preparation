package OCA.Chapter3;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Review 32_33
public class LocalDateFormat {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015,5,10,11,22,33);

        Period.of(1,2,3); // valid
        DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        System.out.println(f_short.format(dateTime));// 5/10/15, 11:22 AM
//        System.out.println(dateTime.format(f_long));// java.time.DateTimeException: Unable to extract ZoneId from temporal 2015-05-10T11:22:33

        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("America/New_York")); // specify a time zone
        DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        System.out.println(f_long.format(zonedDateTime)); // Outputs with time zone information
    }
}
