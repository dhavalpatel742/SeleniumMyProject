package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(5,6);
		sum(8,9);
		sum(1,2,3);
		sum();
		
		//This is called method overloading
		//same method name but different parameters/arguments

	}
	
	public static void sum(int b , int c) {
		int a = b + c;
		System.out.println(a);
	}
	
	public static void sum(int b , int c , int d) {
		int a = b + c;
		System.out.println(a);
	}
	
	public static void sum() {
		int a = 10 + 20;
		System.out.println(a);
	}

}
