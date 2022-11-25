import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test3 {
    static final int number = 16;
	 
  public static void main(String[] args) {
		Random rand = new Random();
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < number; i++) {
			double n = rand.nextDouble();
			list.add(n);
			System.out.printf(" %.3f ", n);
		}
		System.out.println();
		for (int i = number; i > 0; i--) {
			double n=list.get(i-1);
			list.set(number-i, n);
		}
		for (double n: list) {
			System.out.printf(" %.3f ", n);
		}
	}
}

