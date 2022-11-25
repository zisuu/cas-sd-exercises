package exCollections.examples.set;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapFirstLast {
	public static void main(String[] args) {
		// Create a tree map
		TreeMap<Integer,String> treeMap = new TreeMap<>();

		// Put elements to the map
		treeMap.put(23, "White");
		treeMap.put(45, "Red");
		treeMap.put(16, "Green");
		treeMap.put(12, "Black");
		treeMap.put(35, "Pink");
		treeMap.put(17, "Grey");
		treeMap.put(13, "Yellow");
		treeMap.put(25, "Blue");

		System.out.println("Original TreeMap content: " + treeMap);
		System.out.println("Smallest key: " + treeMap.firstKey());
		System.out.println("Greatest key: " + treeMap.lastKey());
		System.out.println("Keys are greater than or equal to 20: " +
				treeMap.tailMap(20));
	}
}