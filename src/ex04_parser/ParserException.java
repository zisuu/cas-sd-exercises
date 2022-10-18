package ex04_parser;

public class ParserException extends Throwable {
    public ParserException(String s, NumberFormatException e) {
        super(s);
    }
}
