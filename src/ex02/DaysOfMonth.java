package ex02;

import java.util.Scanner;

/**
 * Implementieren Sie einen Enum ex02.Month, welcher die Monate eines Jahres repräsentiert.
 * Implementieren Sie eine Methode getNumberOfDays, die für einen übergebenen Monat die Anzahl Tage zurückgibt.
 * Schreiben Sie ein Programm, das über alle Monate iteriert und jeweils den Namen des Monats und die Anzahl Tage ausgibt.
 */
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().strip();
        Month selectedMonth = Month.valueOf(userInput.toUpperCase());
        System.out.printf("%s has %d days", userInput, getNumberOfDays(selectedMonth));
    }

    private static int getNumberOfDays(Month userInput) {
        return userInput.getDays();
    }
}
