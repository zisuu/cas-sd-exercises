package exCollections.exe2;

/**
 * The test Data class with some unusual compareTo and equals methods.
 *
 */
public class Data implements Comparable<Data> {
	private final int id;
	private final String description;
	
	public Data(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(Data o) {
		return Integer.compare(o.id, id);
	}

	// unusual compareTo method.
//	@Override
//	public int compareTo(Data o) {
//		return id/5;
//	}

	
	// unusual equals method.
//	@Override
//	public boolean equals(Object obj) {
//		return id > 3;
//	}
	
	// unusual hashCode method.
//	@Override
//	public int hashCode() {
//		return 17;
//	}
	
}
