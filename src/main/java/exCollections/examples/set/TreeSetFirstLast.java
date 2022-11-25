package exCollections.examples.set;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetFirstLast {
	public static void main(String[] args) {

		TreeSet<Integer> tree_num = new TreeSet<>();
		TreeSet<Integer> treeheadset = new TreeSet<>();
		Random rand = new Random();
		for (int i = 0; i < 100; i++)
			tree_num.add(rand.nextInt(300));

		System.out.println("First Element: " + tree_num.first());
		System.out.println("Last Element: " + tree_num.last());

		// Find all numbers less than 7
		treeheadset = (TreeSet<Integer>) tree_num.headSet(20);
		System.out.println("Tree head set: numbers less than 20 ");
		for (int ele : treeheadset){
			System.out.print(ele + " ");
		}
	}
}
