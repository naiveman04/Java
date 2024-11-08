package Expt4;

public class ConstOverloading {
	
	private String name;
	private int age;
	
	// Constructor with no parameters
	public ConstOverloading() {
		this.name = "Mak";
		this.age = 19;
	}
	
	// Constructor with one parameter
	public ConstOverloading(String name) {
		this.name = name;
		this.age = 19;
	}
	
	// Constructor with two parameters
	public ConstOverloading(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		
		ConstOverloading person1 = new ConstOverloading();
		ConstOverloading person2 = new ConstOverloading("Vedant");
		ConstOverloading person3 = new ConstOverloading("Vedant", 20);
		
		person1.display();
		person2.display();
		person3.display();
	}
}
		