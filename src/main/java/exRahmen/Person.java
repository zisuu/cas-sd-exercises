package exRahmen;

public class Person implements Measurable {
	private String name;
	private double measure;

	public Person(String firstName, String lastName, double d) {
		name = firstName + " " + lastName;
		this.measure = d;
	}

	public String getName() {
		return name;
	}

	public double getMeasure() {
		return measure;
	}
}
