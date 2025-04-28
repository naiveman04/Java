package Expt1;
import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to find the factorial of: ");
		int number = sc.nextInt();
		int factorial = 1;
		
		if(number <= 0) {
			System.out.println("Invalid number to find a factorial of. Enter a positive number.");
		}
		else {
			for(int i = 1; i <= number; i++) {
				factorial = factorial*i;
			}
			System.out.println("\nThe factorial of "+number+" is "+factorial+".");
		}
		
	}

}
