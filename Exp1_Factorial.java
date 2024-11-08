package Expt1; 
import java.util.Scanner; 

public class Factorial{ 
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter number to find factorial: "); 
		int number = sc.nextInt(); 
		
		double factorial = 1; 
		for(int i = 1; i<=number; i++) { 
			factorial *= i;
		}
			
		System.out.println("Factorial of given number is: " + factorial);
	}
}
