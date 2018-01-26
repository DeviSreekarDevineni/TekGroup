package com.tek.general;

public class UsingWhile {
	
	private int a=5;

	public UsingWhile() {
		
		
		while(a>0)
		{
		System.out.println("The value of a is: "+a);
		a--;
		}
	}

	public static void main(String[] args) {
		
		new UsingWhile();

	}

}
