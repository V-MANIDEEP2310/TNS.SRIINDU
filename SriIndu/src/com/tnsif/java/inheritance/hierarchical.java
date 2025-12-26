package com.tnsif.java.inheritance;

public class hierarchical 
{
	public void show1()
	{
		System.out.println("A");
	}

}
class A extends hierarchical 
{
	public void show2()
	{
		System.out.println("B");
	}
}
class B extends hierarchical 
{
	public void show3()
	{
		System.out.println("c");
	}
}