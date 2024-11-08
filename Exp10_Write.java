package Expt10;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Write {

	public static void main(String args[]) {
		try {
			FileWriter wr=new FileWriter("fw.txt");
			wr.write("write operation successfull you are in read mode");
			wr.close();
			
			System.out.println("done");
			File obj=new File("fw.txt");
			Scanner read =new Scanner(obj);
	
			while(read.hasNextLine()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();
		}
	
		catch(FileNotFoundException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
		catch (IOException e) {
			System.out.println("error occured"); e.printStackTrace();
		}
	}
}
