package ex03;

import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 1) Implementieren Sie ein Interface ex03.Clock mit der Methode getTime, welche die aktuelle Zeit als String zurückgibt.
 * 2) Implementieren Sie eine Klasse EnglishClock-Klasse, die das Interface ex03.Clock implementiert und
 *    die Zeit im 12-Stundenformat zurückgibt (z.B. 3:30 PM).
 * 3) Implementieren Sie eine Klasse ISOClock-Klasse, die das Interface ex03.Clock implementiert und die Zeit
 *    im ISO-Format zurückgibt (z.B. 15:30:45.010).
 * 4) Schreiben Sie ein Programm, das einer Variablen vom Typ ex03.Clock nacheinander ein EnglishClock- und ein
 *    ISOClock-Objekt zuweist, die entsprechende Uhrzeit abfragt und ausgibt.
 */
public interface Clock {
    default String getTime() {
        return LocalTime.now().toString();
    }
}
