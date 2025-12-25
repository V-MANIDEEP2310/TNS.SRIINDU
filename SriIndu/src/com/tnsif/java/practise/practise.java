package com.tnsif.java.practise;

public class practise {
	private int pid;
	public void  setpid(int pid)
	{
		this.pid=pid;
    }
	public int getpid()
	{
		return pid;
	}
	public static void main(String [] args)
	{
	practise p =new practise();
	
	p.setpid(34);
	System.out.println("PRACTISE ID:"+p.getpid());
	}
}
