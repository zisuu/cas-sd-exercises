package exRahmen;



public class Pair<T> {
	   private T firstValue;
	   private T secondValue;

	   public Pair(T firstValue, T secondValue) {
	     this.firstValue = firstValue;
	     this.secondValue = secondValue;
	   }

	   public T getFirstValue() {
	     return firstValue;
	   }

	   public T getSecondValue() {
	     return secondValue;
	   }
	}

