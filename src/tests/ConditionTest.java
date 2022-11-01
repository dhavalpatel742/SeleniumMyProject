package tests;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		
		if(a==b) 
		{
			System.out.println("a and b are equal");
		} 
		else 
		{
			System.out.println("a and b are not equal");
		}
		
		String expected = "Selenium";
		String actual = "Selenium";
		
		if(expected.equals(actual)) 
		{
			System.out.println("test pass");
		}
		else 
		{
			System.out.println("test Fail");
		}

	}

}
