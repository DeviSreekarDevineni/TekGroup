package com.tek.general;

public class UsingWhile1 {
	
	private int x=5;
	private int y=2;

	public UsingWhile1() {
	    
		while(x>y)
		{
		System.out.println("The value of x is "+x);
		System.out.println("The value of x is "+y);
		y++;
		x--;
		}
	}

	public static void main(String[] args) {
		
		new UsingWhile1();

	}

}
