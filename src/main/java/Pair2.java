import java.util.Objects;

public class Pair2<T, U> {
    private T firstValue;
    private U secondValue;

    public Pair2(T firstValue, U secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public T getFirstValue() {
        return firstValue;
    }
    public U getSecondValue() {
        return secondValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair2<?, ?> pair2 = (Pair2<?, ?>) o;
        return Objects.equals(firstValue, pair2.firstValue) && Objects.equals(secondValue, pair2.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

}