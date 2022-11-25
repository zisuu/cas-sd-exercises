package exCollections.exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test3 {
	  // Create random list and reverse its order
	  static final int number = 16;
		
	  public static void main(String[] args) {
			Random rand = new Random();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < number; i++) {
				int n = rand.nextInt(10,99);
				list.add(n);
				System.out.printf(" %d ", n);
			}
			System.out.println();
			for (int i = 0; i < number/2; i++) {
				int n1 = list.get(i);
				int n2 = list.get(number-(1+i));
				list.set(number-(1+i), n1);
				list.set(i, n2);
			}

			for (int n: list) {
				System.out.printf(" %d ", n);
			}
		}
	}
