package Expt5;
import java.util.Scanner;
import java.util.Arrays;

class arraySort {
	
	int arr[]=new int[5];
	Scanner sc=new Scanner(System.in);

	void create() {
		System.out.println("The array is created");
	}

	void initialize() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}

	void display() {
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}

	void display1() {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}

	void arrsort() {
		System.out.println("\nThe sorted array in ascending order:");
		Arrays.sort(arr);
		display();
		System.out.println("\nThe sorted array in descending order:");
		display1();
	}
}

public class IntegerSort {
		
	public static void main(String[] args) { 
		
		arraySort a=new arraySort();
		a.initialize();
		a.create();
		a.display();
		a.arrsort();
	}
}