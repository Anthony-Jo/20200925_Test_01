package Test_01;

import java.io.IOException;

public class Test_05 
{
	public static void main(String[] args) throws IOException
	{
		int val1, val2, val3;
		System.out.print("Input: ");
		
		val1 = System.in.read();
		val2 = System.in.read();
		val3 = System.in.read();	/*	only one character can be processed	*/
									/*	System.in.read() is must be allocated as an int variable	*/
		System.out.println("Input Data(val1): " + val1);
		System.out.println("Input Data(val2): " + val2);
		System.out.println("Input Data(val3): " + val3);
	}	
}
