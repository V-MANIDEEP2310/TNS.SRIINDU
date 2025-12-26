package com.tnsif.java.inheritance;

public class multiple 
{
	public void show1()
	{
		System.out.println("A");
	}
}
class ramu extends multiple
{
	public void show2()
	{
		System.out.println("B");
	}
}
class raju extends ramu
{
	public void show3()
	{
		System.out.println("C");
	}
}

