package com.tnsif.java.day8;

public class Throwdemo {

	public static void main(String[] args) {
	 int age=20;
	 if(age>20) {
		 System.out.println("ELIGIBLE");
	 }
	 else {
		 throw new ArithmeticException("NOT ELIGIBLE");
	 }

	}

}
