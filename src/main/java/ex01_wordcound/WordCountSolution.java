package ex01_wordcound;
import java.io.*;

public class WordCountSolution {

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader(args[0]);
        while (true) {
            int c = reader.read();
            if (c == -1) break;
        //...
        }
        reader.close();
        //...
    }
}
