package ex03_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class EnglishClock implements Clock {
    public static void main(String[] args) {
        EnglishClock watch = new EnglishClock();
        System.out.println(watch.getTime());
    }

    @Override
    public String getTime() {
        String fromTimeZone = "Europe/London";
        SimpleDateFormat format = new SimpleDateFormat("h:mm a");
        Date date = new Date();
        format.setTimeZone(TimeZone.getTimeZone(fromTimeZone));
        String englishDate = format.format(date);
        return englishDate;
    }
}
