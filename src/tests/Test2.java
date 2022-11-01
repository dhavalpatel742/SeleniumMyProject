package tests;

public class Test2 {
	
	static Test2 t2 = new Test2();
	
	public static void main(String[] args) {
		
		blue();
		
	}
	
	public static void blue() {
		System.out.println("blue method");
	}
	
	public void red() {
		System.out.println("red method");
	}
	
	//constructor
	//when method name is same as class name and with no return type
	
	public Test2() {
		System.out.println("i am in constructor");
	}

}
