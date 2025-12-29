package com.tnsif.java.day4;

public class superr {
	int a=10;
	public void show() {
	}

}
class mani extends superr{
	int a=20;
	public void display() {
		System.out.println("LOCAL:"+a);
		System.out.println("INSTANCE:"+super.a);
	}
}
