package ex03_time;

import java.sql.Time;

public class Watch implements Clock {
    public static void main(String[] args) {
        Watch watch = new Watch();
        System.out.println(Time.valueOf(watch.getTime()));
    }
}
