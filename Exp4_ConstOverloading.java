package Expt4;

public class ConstOverload2 {

	int age;
	String name;
	
	public ConstOverload2() {
		this.name = "Sahil";
		this.age = 25;
	}
	
	public ConstOverload2(String name) {
		this.name = name;
		this.age = 25;
	}
	
	public ConstOverload2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " +name+ ", Age: " +age);
	}
	
	public static void main(String[] args) {
		
		ConstOverload2 obj1 = new ConstOverload2();
		ConstOverload2 obj2 = new ConstOverload2("Vedant");
		ConstOverload2 obj3 = new ConstOverload2("Nikhil", 18);
		
		obj1.display();
		obj2.display();
		obj3.display();
	}

}
