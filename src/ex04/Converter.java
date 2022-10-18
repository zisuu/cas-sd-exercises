package ex04;

import java.util.Scanner;

/**
 * 1) Implementieren Sie eine Klasse Parser mit einer statischen Methode parse, welche einen Binärstring in eine
 *    Dezimalzahl umwandelt.
 * 2) Implementieren Sie die Exception-Klasse ParserException und werfen Sie in der parse-Methode eine Instanz
 *    mit zugehöriger Fehlermeldung, wenn der übergebene String ein ungültiges Zeichen enthält.
 * 3) Werfen Sie zusätzlich eine IllegalArgumentException, wenn das Argument null oder ein leerer String ist.
 * 4) Schreiben Sie ein Programm, welches den als Programmargument übergebenen String in eine Dezimalzahl umwandelt
 *    und das Resultat ausgibt.
 */
public class Converter {
    public static void main(String[] args) throws ParserException {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.nextLine();
        System.out.println(Parser.parse(binaryString));
    }
}
