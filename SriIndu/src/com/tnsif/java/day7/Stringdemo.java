package com.tnsif.java.day7;

public class Stringdemo {

	public static void main(String[] args) {
		String S = new String("manideep");
		String S1 = new String("manideep");
		System.out.println("hello:"+S.toUpperCase());
		System.out.println("NAME:"+S1.toUpperCase());
		System.out.println(S.charAt(3));
		System.out.println(S1.contentEquals(S));
		
	}

}
