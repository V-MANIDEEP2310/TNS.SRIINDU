package com.tnsif.java.day8;

public class TryFinally {

	public static void main(String[] args) {
		try {
			int a=100;
			int b=0;
			int c=a/b;
			System.out.print(c);
		}
		finally {
			System.out.print("Output doesn't occur");
		}

	}

}
