package ex04;

public class ParserException extends Throwable {
    public ParserException(String s, NumberFormatException e) {
        super(s);
    }
}
