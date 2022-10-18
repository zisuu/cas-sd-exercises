package ex04;
import java.util.Scanner;

public class Parser {
//    public static void main(String[] args) throws ParserException {
//        Scanner scanner = new Scanner(System.in);
//        String binaryString = scanner.nextLine();
//        System.out.println(parse(binaryString));
//    }

    public static int parse(String binaryString) throws ParserException {
        if (binaryString == null || binaryString.isEmpty()) {
            throw new IllegalArgumentException("InputSting cannot be empty");
        }
        try {
            return Integer.parseInt(binaryString, 2);
        } catch (NumberFormatException e) {
            throw new ParserException("InputSting contains illegal Character : " + binaryString, e);
        }
    }
}
