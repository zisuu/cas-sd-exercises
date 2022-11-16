package exRahmen;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static double numbers[] = { 1.2, 4.3, 12.0, 9.7, 5, 14.3, 15.5, 6 };
	
	public static void main(String[] args) {
		List<Person> liste = new ArrayList<>();
		for (double d : numbers) {
			liste.add(new Person("Max", "Muster", d));
		}
		Pair<Person> pair = minMax(liste);
		System.out.println(pair.getFirstValue().getName() + ": " + pair.getFirstValue().getMeasure());
		System.out.println(pair.getSecondValue().getName() + ": " + pair.getSecondValue().getMeasure());
	}

	private static <T extends Measurable> Pair<T> minMax(List<T> liste) {
		T minValue = liste.get(0);
		T maxValue = liste.get(0);
		for(T item: liste) {
			if (minValue.getMeasure() > item.getMeasure()) {
				minValue = item;
			}
			if (maxValue.getMeasure() < item.getMeasure()) {
				maxValue = item;
			}
		}

		Pair<T> result = new Pair<>(minValue, maxValue);
		return result;
	}
}




