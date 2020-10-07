package Test_01;

import java.io.IOException;

public class Test_06 {

	public static void main(String[] args) throws IOException 
	{ 
		System.out.print("Input char: "); 
		
		int num =System.in.read(); 
		
		System.out.println("==== Out Put ===="); 
		System.out.println("Inputed char :" + (char)num); 
		System.out.println("Changed :" + (char)(num - 32));
	}
}
