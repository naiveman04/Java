package Expt5;
import java.util.Scanner;
import java .util.Arrays;

class araySort {
	
	String arr[] = new String[3]; 
	Scanner sc = new Scanner(System.in);

	void create() {
		System.out.println("The array is created");
	}

	void initialize() {
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.nextLine();
		}
	}

	void display() {
		for(String x:arr) {
			System.out.println(x);
		}
	}

	void display1() {
		for(int i=arr.length-1;i>=0;i--) { 
			System.out.println(arr[i]);
		}
	}

	void arrsort() {
		System.out.println("The sorted array in ascending order:"); 
		Arrays.sort(arr);
		display();
		System.out.println("The sorted array in descending order:"); 
		display1();
	}
	}

public class StringSort {

	public static void main(String[] args) { 
		
		araySort a=new araySort(); 
		a.create();
		a.initialize();
		a.display();
		a.arrsort();
	}
}