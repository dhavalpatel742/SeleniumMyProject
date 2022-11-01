package tests;

public class ResturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use of return type
		
		System.out.println(sum());
		
		int x = sum();
		System.out.println(x);
		
		System.out.println(hello());

	}
	
	public static int sum() {
		
		int a = 4+5;
		return a;
	}
	
	public static String hello() {
		String s = "hello java";
		return s;
	}

}
