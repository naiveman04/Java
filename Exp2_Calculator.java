package Expt2; 
import java.util.Scanner; 

public class Calculator { 
	public static void main(String[] args) {
		
		int num1,num2,choice,ch; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("This program will take 2 integers and giive you list of operators to perform operations on.");
		System.out.println("\nEnter the two integers: "); 
		num1 = sc.nextInt(); 
		num2 = sc.nextInt(); 
		
		do {
			System.out.println("\nThe menu for operations is:\nl.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Factorial");
			System.out.println("Enter your choice: "); 
			choice = sc.nextInt(); 
			
			switch(choice) {
				
			case 1: 
				System.out.println("\nAddition operation."); 
				System.out.println("Addition = "+ (num1+num2)); 
				break; 
				
			case 2:
				System.out.println("\nSubtraction operation.");
				System.out.println("Subtraction "+ (num1-num2)); 
				break; 
				
			case 3:
				System.out.println("\nMultiplication operation."); 
				System.out.println("Multiplication = "+ (num1*num2)); 
				break; 
			
			case 4:
				System.out.println("\nDivision operation."); 
				System.out.println("Division = "+ (num1/num2)); 
				break; 
			
			case 5:
				System.out.println("\nFactorial operation."); 
				System.out.println("Enter a number"); 
				num1= sc.nextInt(); 
				int i, fact = 1; 
				
				if(num1==0) {
					System.out.println("Factorial = 1"); 
				}
				else {
					for(i=1; i<=num1; i++) {
						fact *= i;
					}
				}
				
				System.out.println("Factorial = "+ fact); 
				break; 
			
			default: 
				System.out.println("Invalid choice."); 
			}
			System.out.println("\nIf you want to stop enter 0,else enter any another digit."); 
			ch = sc.nextInt(); 
		}
		
		while(ch!=0); 
		System.out.println("Program stopped.");
	}
}