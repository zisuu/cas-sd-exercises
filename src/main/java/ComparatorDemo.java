import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    static Comparator<Box<String>> byContent =
            (Box<String> o1, Box<String> o2)
                    -> o1.compareTo(o2.getContent());

    public static void main(String[] args) {
        List<Box<String>> names = new ArrayList<Box<String>>();
        names.add(new Box<>("Max Muster"));
        names.add(new Box<>("Aaron Muster"));
        names.add(new Box<>("Urs Muster"));
        names.sort(byContent);
        for (Box<String> b : names) {
            System.out.println(b.getContent());
        }
    }
}
