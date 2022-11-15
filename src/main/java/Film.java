public class Film extends Article<String,StringBuilder,Double>{


    public Film(String id, StringBuilder description, Double volume) {
        super(id, description, volume);
    }

    @Override
    public String toString() {
        return "Film{} " + super.toString();
    }
}
