package ex09_wordanalytics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Lesen Sie mit der Methode readAllLines der Klasse Files die Wörter der Datei words.txt ein und bestimmen
 * Sie mithilfe von Stream-Pipelines:
 *
 *     die Anzahl aller Wörter
 *     die Länge des längsten Wortes
 *     das längste Wort
 *     die Anzahl Wörter mit Anfangsbuchstabe x
 *     die Anzahl Wörter aller Anfangsbuchstaben
 *     die Anzahl Wörter ohne Vokale
 *     das längste Wort ohne Vokale
 *     den häufigsten Anfangsbuchstaben
 *     den häufigsten Buchstaben überhaupt
 */
public class WordAnalytics {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/Dave/IdeaProjects/cas-sd-exercises/src/ex09_wordanalytics/words.txt";
        Stream<String> inputStream = Files.readAllLines(Paths.get(filename)).stream();

        long numberOfWords = inputStream.count();
        System.out.printf("die Anzahl aller Wörter: %d", numberOfWords);
//        System.out.printf("die Länge des längsten Wortes: %d", numberOfWords);
//        System.out.println(inputStream.map(word -> word.length()));
    }
}
