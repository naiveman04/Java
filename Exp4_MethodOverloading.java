package Expt4; 

public class MethodOverloading { 
	
	public int add(int a, int b) { 
		return a + b; 
	}
	
	public int add(int a, int b, int c) { 
		return a + b + c; 
	}
	
	public double add(double a, double b) { 
		return a + b; 
	}
	
	public static void main(String[] args) { 
		MethodOverloading obj = new MethodOverloading(); 
		System.out.println("Sum of 3 and 2 is: " + obj.add(3, 2)); 
		System.out.println("Sum of 3, 1 and 2 is: "+ obj.add(3, 2, 1)); 
		System.out.println("Sum of 3.5 and 2.1 is: " + obj.add(3.5, 2.1));
	}
}
