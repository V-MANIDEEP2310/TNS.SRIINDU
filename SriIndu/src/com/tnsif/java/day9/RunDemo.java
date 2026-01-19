package com.tnsif.java.day9;

public class RunDemo {

	public static void main(String[] args) {
		RunThread rt = new RunThread();
		Thread t = new Thread(rt);
		t.start();
		

	}

}
