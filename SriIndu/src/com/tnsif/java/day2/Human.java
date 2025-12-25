package com.tnsif.java.day2;

import java.util.Scanner;

public class Human {
	public static void main(String [] args)
	{
		Human h =new Human ();
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		System.out.println("Enter your name");
		String hname=sc.nextLine();
		System.out.println("Enter your salary");
		int hsalary=sc.nextInt();
		System.out.println("Enter your location");
		String hlocation=sc.next();
		
		System.out.println("NAME:"+hname);
		System.out.println("SALARY:"+hsalary);
		System.out.println("LOCATION:"+hlocation);
	}

}

