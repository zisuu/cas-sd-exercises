package ex01_wordcound;

import java.io.FileReader;
import java.io.Reader;

/**
 * Mit dem folgenden Programm kann der Inhalt einer Textdatei zeichenweise eingelesen werden.
 *
 * Ergänzen Sie das Programm so, dass die Zeichen, Wörter und Zeilen der Textdatei gezählt und
 * ausgegeben werden. Ein Wort soll dabei als zusammenhängende Folge von alphabetischen Zeichen
 * interpretiert werden. Die Beispieldatei loriot.txt enthält 113 Zeilen, 937 Wörter und 6551 Zeichen.
 */
public class WordCount {
    public static void main(String[] args) throws Exception {
        int lineCounter = 1; // if there is at least one char we already have 1 line
        int wordCounter = 1; // if there is at least one letter we already have 1 word
        boolean lastCharacterWasLetter = false;
        int symbolCounter = 0;
        Reader reader = new FileReader(args[0]);
        while (true) {
            int singleCharacter = reader.read();
            if (singleCharacter == -1) break;
            // asci code for Line Feed = 10
            if (singleCharacter == 10) {
                lineCounter++;
            }
            if (Character.isDefined(singleCharacter) && !Character.isWhitespace(singleCharacter)) {
                symbolCounter++;
            }
            if (Character.isLetter(singleCharacter)) {
                lastCharacterWasLetter = true;
            } else if (lastCharacterWasLetter) {
                wordCounter++;
                lastCharacterWasLetter = false;
            }
            System.out.println("int: " + singleCharacter + ", char: " + (char) singleCharacter);
        }
        reader.close();
        System.out.printf("You file contains %d lines, %d words and %d symbols.", lineCounter, wordCounter, symbolCounter);
    }
}