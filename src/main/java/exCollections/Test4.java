
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test4 {
	static final int number = 300000;

	public static void main(String[] args) {
		long timeStart, timeEnd;
		Random rand = new Random();

		timeStart = System.currentTimeMillis();
		List<Double> list1 = new ArrayList<Double>();
		for (int i = 0; i < number; i++) {
			list1.add(rand.nextDouble());
		}
		timeEnd = System.currentTimeMillis();

		System.out.println("Einfügen in Liste: " + (timeEnd - timeStart) + " mSec");
	}
}
