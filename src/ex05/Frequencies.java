package ex05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * 1) Schreiben Sie ein Programm Frequencies, das einen gegebenen Text in Wörter aufspaltet, deren Häufigkeiten
 *    bestimmt und die Wörter alphabetisch sortiert mit ihren Häufigkeiten ausgibt.
 * 2) Lesen Sie den Text aus einer Datei, deren Name als Programmargument übergeben wird.
 */
public class Frequencies {
    static HashMap<String, Integer> countedWordList = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
        String filename = args[0];
        String userInput = new String(Files.readAllBytes(Paths.get(filename)));
        // remove all unwanted symbols out of userInput, also make all lowercase
        userInput = userInput.replaceAll("[^A-Za-z\\ äöüß]", "").toLowerCase();
        String[] words = userInput.split(" ");
        Arrays.sort(words);
        for (String word : words){
            if (countedWordList.containsKey(word)) {
                countedWordList.replace(word, countedWordList.get(word) + 1);
            } else {
                countedWordList.put(word, 1);
            }
        }
//        System.out.println(countedWordList);
        // Calling the function to sortbyKey
        sortbykey();
    }

    public static void sortbykey() {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(countedWordList);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
    }
}
