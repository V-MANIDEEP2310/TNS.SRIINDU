package com.tnsif.java.day9;

public class multiThread extends Thread {
	public void run() {
		try {
			
		
		System.out.println("This is Thread class:" +"Thread.currentThread().getId()");
		Thread.sleep(5000);
		}
		catch(Exception w) {
			System.out.println("Exception caught");
			
		}
	}

}
