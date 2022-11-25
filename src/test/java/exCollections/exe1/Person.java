package exCollections.exe1;

import java.util.Objects;

public class Person implements Comparable<Person>{
	private String lastName;
	private String firstName;
	private long departement;
	private Address address;

	public Person(String lastName, String firstName, long dept) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.departement = dept;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getDepartement() {
		return departement;
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, departement, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && departement == other.departement
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

	@Override
	public int compareTo(Person p) {
		if(lastName.compareTo(p.lastName) != 0)
				return lastName.compareTo(p.lastName);
			
		if(firstName.compareTo(p.firstName) != 0)
			return firstName.compareTo(p.firstName);
		if(departement != p.getDepartement())
			return Long.compare(departement, p.departement);
		else
			return address.compareTo(p.address);
		
	}



	public static class Address implements Comparable<Address>{
		private String street;
		private int plz;
		private String city;

		public Address(String street, int plz, String city) {
			this.street = street;
			this.plz = plz;
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public int getPlz() {
			return plz;
		}

		public String getCity() {
			return city;
		}

		@Override
		public boolean equals(Object obj) {
			System.out.println("--------------------equals von Address --------------");
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			return Objects.equals(city, other.city) && plz == other.plz && Objects.equals(street, other.street);
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(city, plz, street);
		}

		@Override
		public int compareTo(Address o) {
			if(this.plz < o.plz)
				return -1;
			return this.street.compareTo(o.street);
		}
	}
}
