package com.tnsif.intro.java.day9;

public class Threaddemo {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<5;i++) {
			multiThread mt = new multiThread();
			mt.start();
			Thread.sleep(5000);
			
		}
		

	}

}
