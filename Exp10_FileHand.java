package Expt10;
import java.io.File;
import java.io.IOException;

public class FileHandle {

	public static void main(String[] args) {

		try {
			File f1=new File("file1.txt");
			if(f1.createNewFile()) {
				System.out.println("File created:"+f1.getName());
			}
			else {
				System.out.println("File not created");
			}
		}
	
		catch (IOException e) {
			System.out.println("Error occured.");
			e.printStackTrace();
		}
	}
}