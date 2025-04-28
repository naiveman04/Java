package Expt1;
import java.util.Scanner;

public class Average2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to take avg of: ");
		int noOfElements = sc.nextInt();
		
		int[] arrayOfElements = new int[noOfElements];
		int sum = 0;
		
		System.out.println("\nEnter the elements: ");
		for(int i = 0; i < noOfElements; i++) {
			arrayOfElements[i] = sc.nextInt();
			sum += arrayOfElements[i];
		}
		
		double average = (double)sum/noOfElements;
		System.out.printf("\nThe average is: %.2f%n", average);
		
	}
}
