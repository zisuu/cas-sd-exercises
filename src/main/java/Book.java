public class Book extends Article<Integer, String, Integer>{

    public Book(Integer id, String description, Integer volume) {
        super(id, description, volume);
    }

    @Override
    public String toString() {
        return "Book{} " + super.toString();
    }
}
