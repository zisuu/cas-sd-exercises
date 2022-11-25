package exCollections.examples.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {

	static final int number = 500000;

	public static void main(String[] args) {
		long timeStart, timeEnd;
		Random rand = new Random();
		List<Double> list = new ArrayList<>();
		timeStart = System.currentTimeMillis();
		for (int i = 0; i < number; i++) {
			list.add(rand.nextDouble());
		}
		Collections.sort(list);
		timeEnd = System.currentTimeMillis();
		System.out.println("ArrayList: " + (timeEnd - timeStart) + " mSec");

		timeStart = System.currentTimeMillis();
		TreeSet<Double> set = new TreeSet<>(list); // Copy to TreeSet
		timeEnd = System.currentTimeMillis();
		System.out.println("TreeSet: " + (timeEnd - timeStart) + " mSec");
	}
}
