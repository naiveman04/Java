package Expt9;
import java.util.Scanner;

public class ExceptionHandling{

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		try {
			//1.Arithmetic exception
			int a,b;
			System.out.print("Enter first number:"); 
			a=obj.nextInt();
			System.out.print("Enter second number:"); 
			b=obj.nextInt();
			int c=a/b;
			System.out.print(a+"/"+b+"="+c);

			//2.Array index out of bound
			int arr[] = {3,6,9};
			System.out.print(arr[5]);

			//3.null pointer
			String str=null;
			System.out.print(str.charAt(0));

			//4.Number format exception
			int ab = Integer.parseInt("abc"); System.out.println(ab);

			//5.String index out of bound
			String str1 ="Java Programming";
			System.out.println(str1.charAt(30));
		}
		
//		catch(Exception e) {
//			System.out.println("Arithmetic Exception division by O is not possible+"+e.getMessage());
//		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception division by O is not possible+"+e.getMessage());
		}
	
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound "+e);
		}
	
		catch(NullPointerException e){
			System.out.println("\nNull pointer exception "+e);
		}
	
		catch(NumberFormatException e){
			System.out.println("Number Format Excetion "+e);
		}
	
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String index out of bound exception "+e);
		}
	
		catch(ArrayStoreException e){
			System.out.println("Array store exception.. "+e);
		}
	
		finally{
			System.out.println("\nTry-catch block is executed");
		}
	}
}