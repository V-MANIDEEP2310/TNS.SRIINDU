package com.tnsif.java.day8;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int a=50;
			int b=50;
			int c=a/b;
			System.out.print(c);
			
			int[] arr = {1,2,3,0,5};
			
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			
			String s = null;
			System.out.println(s.length());
			
		}
		catch(ArithmeticException e) {
			System.out.print("Undefined");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("We cannot read the value of arr[5]");
			
		}
		catch(NullPointerException e) {
			System.out.print("null value");
			
		}
		

	}

}
