/**
 * 
 */
package exCollections.exe2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeSet;

/**
 * The test Main class creates different collections and adds some data objects.
 */
public class Main {

	public static void main(String[] args) {
		ArrayList<Data> arrayList = new ArrayList<>();
		HashSet<Data> hashSet = new HashSet<>();
		TreeSet<Data> treeSet = new TreeSet<>();
		Hashtable<Integer, Data> hashTable = new Hashtable<>();

		hashSet.add(new Data(0, hashSet.getClass().toString()));
		treeSet.add(new Data(0, treeSet.getClass().toString()));
		hashTable.put(0, new Data(0, hashTable.getClass().toString()));
		arrayList.add(new Data(0, arrayList.getClass().toString()));
		
		for (int i = 0; i < 10; i++) {
			hashSet.add(new Data(i, hashSet.getClass().toString() + i));
			treeSet.add(new Data(i, treeSet.getClass().toString() + i));
			hashTable.put(i, new Data(i, hashTable.getClass().toString() + i ));
			arrayList.add(new Data(i, arrayList.getClass().toString() + i));
		}
		
		// print out the size of the different collections
		// explain the output
		System.out.println("HashSet size: " + hashSet.size());
		System.out.println("TreeSet size: " + treeSet.size());
		System.out.println("Hashtable size: " + hashTable.size());
		System.out.println("ArrayList size: " + arrayList.size());
	}
}

