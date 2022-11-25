package exCollections.exe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TimeTestExample {
	static final int number = 100000;

	public static void main(String[] args) {
		long timeStart, timeEnd;
		Data[] dataValues = createDataValues();

		// Insertion at the beginning (add at the beginning).
		timeStart = System.currentTimeMillis();
		List<Data> list = new ArrayList<>();
		for (Data dataItem : dataValues)
			list.add(0, dataItem);
		timeEnd = System.currentTimeMillis();
		System.out.println("Insert at the front: " + (timeEnd - timeStart) + " millisec.");

		// Sum up all values (read with get-method).
		double sum = 0;
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < number; i++)
			sum += list.get(i).getValue();
		timeEnd = System.currentTimeMillis();
		System.out.println("Read elements: " + (timeEnd - timeStart) + " millisec.");
		System.out.printf("Result: %.2f \n", sum);

		// Remove all elements (remove from beginning).
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < number; i++)
			list.remove(0);
		timeEnd = System.currentTimeMillis();
		System.out.println("Remove elements from list: " + (timeEnd - timeStart) + " millisec.");

		// Insert elements (add at the end).
		timeStart = System.currentTimeMillis();
		for (Data dataItem : dataValues)
			list.add(dataItem);
		timeEnd = System.currentTimeMillis();

		// Sorted insertion in the list (read with get method).
		System.out.println("Insert at the end of the list: " + (timeEnd - timeStart) + " millisec.");
		list.clear();
		for (int i = 0; i < number; i++) {
			Data dataItem = dataValues[i];
			int j = 0;
			while (j < i && list.get(j).getValue() < dataItem.getValue())
				j++;
			list.add(j, dataItem);
		}
		timeEnd = System.currentTimeMillis();
		System.out.println("Sorted insertion: " + (timeEnd - timeStart) + " millisec.");

		// Find 10 elements in ArrayList, use the contains method.
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			Data dataItem = list.get((list.size() + 10 * i) / 2);
			list.contains(dataItem);
		}
		timeEnd = System.currentTimeMillis();
		System.out.printf("Found 10 elements in %d millisec.", timeEnd - timeStart);
	}

	private static Data[] createDataValues() {
		Random rand = new Random();
		Data[] values = new Data[number];
		for (int i = 0; i < number; i++)
			values[i] = new Data(rand.nextDouble() * number);
		return values;
	}

	static class Data {
		private final double value;

		Data(double n) {
			value = n;
		}

		public double getValue() {
			return value;
		}
	}
}

