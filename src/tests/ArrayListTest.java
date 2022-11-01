package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("selenium");
		tools.add("java");
		tools.add("junit");
		tools.add("testing");
		
		System.out.println("size is" + " "+ tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		System.out.println("-----------------------------------------------");
		
		tools.add("testlink");
		System.out.println("size is" + " "+ tools.size());
		System.out.println(tools.get(4));
		
		System.out.println("-----------------------------------------------");
		
		tools.remove(2);
		System.out.println("After removing number 2" + " " + tools.get(2));
		System.out.println("size is" + " "+tools.size());
		
		System.out.println("-----------------------------------------------");
		
		for(int i = 0; i<tools.size();i++) {
			
			System.out.println(tools.get(i));
		}
		
		

	}

}
