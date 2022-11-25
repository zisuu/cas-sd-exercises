package exCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List<Person> list1 = new ArrayList<Person>();
		List<Person> list2 = new LinkedList<Person>();
		list1.add(new Person("Max"));
		list1.add(new Person("Paul"));
		list2.add(new Person("Felix"));
		System.out.println("list2 orig: ");
		list2 = list1;
		System.out.println(list2.size());
		list2.add(new Person("Felix"));
		System.out.println(list1.size());
		System.out.println(list2.size());
		list1.get(0).setName("Alex");
		System.out.println(list2.get(0).getName());
	}

	static class Person {
		private String name;

		Person(String n) {
			name = n;
		}

		public String getName() {
			return name;
		}

		public void setName(String n) {
			name = n;
		}

	}

}
