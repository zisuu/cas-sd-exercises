import java.util.Arrays;

public class Box<T> {
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return this.content;
    }
    public static void main(String[] args){
        String[] test = {"Max Moser", "Hans Fischer"};
        Box<String[]> box = new Box<>(test);
        System.out.println(Arrays.stream(box.getContent()).toList());
    }
}