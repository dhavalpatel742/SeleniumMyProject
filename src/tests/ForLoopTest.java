package tests;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			if(i==25) {
				System.out.println("got 25");
			break;
			}
		}
		
		System.out.println("Loop out");

	}

}
