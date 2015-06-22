import java.io.Serializable;

public class Person implements Serializable {

	// sorta like a version number. It's generated based on the current code in
	// Person
	private static final long serialVersionUID = -1150098568783815480L;

	// use the transient keyword to prevent words from being serialized
	// id will be stored as 0 in the file
	private transient int id;
	private String name;

	// since count is static, it is not serialized. It doesn't make sense to
	// serialize static fields since it's the same for all instances of the
	// class
	private static int count;

	// Constructors are not run when objects are not deserialized
	public Person() {
		System.out.println("Default constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("2-argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is " + count;
	}

}
