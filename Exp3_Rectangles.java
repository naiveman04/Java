
package Expt3; 
import java.util.Scanner; 

public class Rectangle { 
	public static class Rect { 
		
		float length,width, area; 
		String colour; 
		Scanner sc = new Scanner(System.in); 
		
		public void get_length() { 
			System.out.println("Enter an float num :"); 
			float length = sc.nextFloat(); 
		}
			
		public void get_width() {
			System.out.println("Enter an float num :"); 
			float width = sc.nextFloat();
		}
		
		public float get_area() { 
			area = length*width; 
			System.out.println("Area of Rectangle is: "+ area);
			return area;
		}
		
		public String get_colour() { 
			System.out.println("Enter the colour of rectangle"); 
			colour = sc.next(); 
			return colour; 
		}
			
	public static void main(String[] args) { 
		
		Rect rect1 = new Rect(); 
		rect1.get_length(); 
		rect1.get_width(); 
		rect1.get_area(); 
		rect1.get_colour(); 
		
		Rect rect2 = new Rect(); 
		rect2.get_length(); 
		rect2.get_width(); 
		rect2.get_area(); 
		rect2.get_colour(); 
		
		if(rect1.get_area() == rect2.get_area() && rect1.get_colour() == rect2.get_colour()) {
			System.out.println("The rectangles are matching.");
		}
		else {
			System.out.println("The rectangles are not matching.");
		}
	}
	}
}