import java.util.Arrays;

public class Box<T extends Comparable<T>> {
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return this.content;
    }

    public int compareTo (T o) {
        return content.compareTo(o);
    }
}