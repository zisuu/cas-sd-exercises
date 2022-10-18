package ex06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 1) Schreiben Sie ein Programm Contacts, das Kontaktdaten (Name, Telefon, Email) aus einer CSV-Datei liest und anzeigt.
 *    Der Pfad der CSV-Datei soll als Programmargument übergeben werden.
 * 2) Ergänzen Sie das Programm so, dass neue Kontakte eingegeben und zur CSV-Datei hinzugefügt werden können.
 *
 */
public class Contacts {

    public static void main(String[] args) throws IOException {
        Files.lines(Path.of(args[0]))
            .skip(1)
//                    .limit(100)
            .map(l -> l.split(","))
            .map(a -> {
                Person person = new Person(a[2], a[4], a[28], a[6]);
                return person;
            })
            .forEach(System.out::println);
    }
}
