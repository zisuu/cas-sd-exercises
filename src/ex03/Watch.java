package ex03;

import java.sql.Time;

public class Watch implements Clock {
    public static void main(String[] args) {
        Watch watch = new Watch();
        System.out.println(Time.valueOf(watch.getTime()));
    }
}
