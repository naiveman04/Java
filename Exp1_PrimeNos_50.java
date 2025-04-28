package Expt1;

public class Prime2 {

	public static void main(String[] args) {
		
		int count = 1;
		int num = 2;
		
		while(count<=50) {
			if(isPrime(num)) {
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
		System.out.println();
	}
	
	public static boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
