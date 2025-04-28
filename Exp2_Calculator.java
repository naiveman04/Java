package Expt2;
import java.util.Scanner;

public class Calculator2 {

	public void factorial(int num) {
		long fact = 1;
		
		if(num <= 0) {
			System.out.println("Factorial of negative numbers don't exist!");
		}
		else {
			for(int i = 1; i <= num; i++) {
				fact = i*fact;
			}
			System.out.println("Factorial: "+fact);
		}
	}
	
	public static void main(String[] args) {

		int num1, num2, choice;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		
		System.out.println("This program will take in 2 numbers, and then give you a menu to perform operations on them.");
		System.out.println("\nEnter the two numbers:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		do {
			if(count == 0) {
				System.out.println("\nYou may choose from the following operations:\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Factorial\n6. Exit Program");
			}
			else if(count > 0) {
				System.out.println("\nAgain choose from the following operations:\n1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Factorial\n6. Exit Program");
			}
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Addition: " + (num1+num2));
				break;
				
			case 2:
				System.out.println("Subtraction: " + (num1-num2));
				break;

			case 3:
				System.out.println("Division: " + ((double)num1/(double)num2));
				break;

			case 4:
				System.out.println("Multiplication: " + (num1*num2));
				break;

			case 5:
				System.out.println("Which numbers factorial do you want:\n1. "+num1+"\n2. "+num2);
				int ch = sc.nextInt();
				if(ch == 1) {
					calc.factorial(num1);
				}
				else if(ch == 2) {
					calc.factorial(num2);
				}
				else {
                    System.out.println("Invalid choice!");
                }
				break;
				
			default:
				System.out.println("Enter a valid choice!");
			}
			count++;
		}
		while(choice != 6);
		System.out.println("\nProgram stopped.");
	}

}
