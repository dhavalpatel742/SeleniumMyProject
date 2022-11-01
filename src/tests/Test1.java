package tests;

import selenium.Test4;

public class Test1 {
	/*Call static method- no need to create object
	 call non static - create object*/
	
	//classname objectname= new classname();
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test4 t4 = new Test4();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("i am in main method");
		printMe();
		System.out.println("after print me");
		scanMe();
		t1.testMe();
		t1.paintMe();
		Test2.blue();
		t2.red();
		Test4.bmw();
		t4.audi();
		ArgumentsTest.sum(10, 15);

	}
	
	public static void printMe() {
		System.out.println("i am print me");
	}
	
	public static void scanMe() {
		System.out.println("scan me ok");
	}
	
	public void testMe() {
		System.out.println("test me method");
	}
	
	public void paintMe() {
		System.out.println("paintme");
	}
	
	

}
