package Test_01;

public class Quiz
{
	public static void main(String[] args) 
	{
		final String NAME = "Name";
		final String AGE =  "Age";
		final String HEIGHT = "Height";
		final String IQ = "IQ";
		final String LEVEL = "Level";
		
		final String NAME_VALUE = "Anthony_Jo";
		int age_value = 20;						/* JAVA has no 'unsigned'	*/
		double height_value = 173.3;
		int iq_value = 120;
		char level_value = 'B';
		
		System.out.println(NAME + ": " + NAME_VALUE);
		System.out.println(AGE + ": " + age_value);
		System.out.println(HEIGHT + ": " + height_value);
		System.out.println(IQ + ": " + iq_value);
		System.out.println(LEVEL + ": " + level_value);
	}
}
