package com.smoke;

public class PracticeException1 {
	static int a = 10;
	public static void main(String[] args) {
		System.out.println("Hi!");
		
		try {
		System.out.println(a/0);
		} catch(Exception e) {
			//e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		System.out.println("Bye!");
		
	}

}
