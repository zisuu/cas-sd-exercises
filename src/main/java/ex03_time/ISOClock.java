package ex03_time;

public class ISOClock implements Clock {
    public static void main(String[] args) {
        ISOClock watch = new ISOClock();
        System.out.println(watch.getTime());
    }
}
