package com.tnsif.java.day8;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=40;
			int c=0;
			int b=a/c;
			System.out.print(b);
		}
		catch(Exception e) {
			System.out.print("Undefined");
		}

	}

}
