public class Pair3<T, S> {
    private T firstValue;
    private S secondValue;

    public Pair3(T firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public S getSecondValue() {
        return secondValue;
    }
}