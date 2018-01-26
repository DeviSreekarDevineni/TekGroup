package com.tek.general;

public class UsingBoolean {
	
	private boolean b=true;

	public UsingBoolean() {
		
		
		if(b)
		{
			System.out.println("The boolean is :"+b);
		}
		b=false;
		System.out.println("The area is :"+b);
		System.out.println("9>7 is :"+(9>7));
	}

	public static void main(String[] args) {
		
		new UsingBoolean();

	}

}
