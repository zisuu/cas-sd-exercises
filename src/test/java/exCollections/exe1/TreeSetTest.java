package exCollections.exe1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeSetTest {

	private static Person p1, p2, p3, p4, p5, p6;
	final static Logger logger = Logger.getLogger(TreeSetTest.class.getName());

	@BeforeAll
	public static void setUp(){
		p1 = new Person("Muster", "Max", 57);
		p2 = new Person("Muster", "Max", 44);
		p3 = new Person("Muster", "Paul", 44);
		p4 = new Person("Master", "Max", 57);
		p5 = new Person("Muster", "Max", 57);
		p6 = new Person("Muster", "Max", 57);
		Person.Address a1 = new Person.Address("Kramgasse 10", 3011, "Bern");
		Person.Address a2 = new Person.Address("Kramgasse 3", 3010, "Bern");
		p1.setAddress(a1);
		p2.setAddress(a1);
		p3.setAddress(a2);
		p4.setAddress(a2);
		p5.setAddress(a2);
		p6.setAddress(a2);
	}

	@Test
	public void test1() {
		assertEquals(p1, p1);
	}

	@Test
	public void test2() {
		assertNotEquals(p1, p2);
		assertNotEquals(p1.hashCode(), p2.hashCode());
	}

	@Test
	public void test3() {
		assertNotEquals(p2, p3);
		assertNotEquals(p2.hashCode(), p3.hashCode());
	}

	@Test
	public void test4() {
		assertNotEquals(p3, p4);
		assertNotEquals(p3.hashCode(), p4.hashCode());
	}

	@Test
	public void test5() {
		assertNotEquals(p2, p5);
		assertNotEquals(p2.hashCode(), p5.hashCode());
	}

	@Test
	public void test6() {
		assertEquals(p5.hashCode(), p6.hashCode());
		assertEquals(p5, p6);
	}

	@Test
	public void test7() {
		assertNotEquals(p1, p6);
		assertNotEquals(p1.hashCode(), p6.hashCode());
	}

	@Test
	public void test8() {
		HashSet<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		logger.info("HashSet Size " + set.size() + "\n");
		assertEquals(5, set.size());
	}

	@Test
	public void test9() {
		TreeSet<Person> set = new TreeSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		logger.info("TreeSet Size " + set.size() + "\n");
		assertEquals(5, set.size());
	}
}

