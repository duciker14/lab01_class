package binh.dev.models;

public class Person {
	
	static String nameSchool = "To Huu";
	String name;
	int old;
	
	public Person() {}
	
	public Person(String name, int old) {
		super();
		this.name = name;
		this.old = old;
	}

	public Person getInstance() {
		return this;
	}
	
	public void show() {
		System.out.println(this);
	}
}
