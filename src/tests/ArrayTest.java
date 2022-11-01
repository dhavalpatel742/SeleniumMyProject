package tests;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tool = "Selenium";
		String tools[]= {"selenium", "java", "testing", "test", "automation"};
		System.out.println(tools.length);
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		
		String s = " ";
		for(int i=0; i < tools.length; i++ ) {
			System.out.print(tools[i]+s);
			if(i==4) {
				System.out.println(" ");
			}
		}
		
		Object mix[]= {"abc", 9, 'd'};
		System.out.println(mix[0]);
		System.out.println(mix[1]);
		System.out.println(mix[2]);
		

	}
	
}
