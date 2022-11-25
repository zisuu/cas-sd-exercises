package exCollections.exe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
	  // Create random list and remove every second element
	  static final int number = 16;

	  public static void main(String[] args) {
	    Random rand = new Random();
	    List<Double> list = new ArrayList<>();
	    for (int i = 0; i < number; i++) {
	      double n = rand.nextDouble();
	      list.add(n);
	      System.out.printf(" %.3f ", n);
	    }
	    System.out.println();
	    for (int i = number-1; i > 0; i=i-2) {
	      list.remove(i);
	    }
	    for (double n: list) {
	      System.out.printf(" %.3f ", n);
	    }
	  }
	}

