package com.tek.general;

public class UsingIfElseIf {
	
	private int a=5;

	public UsingIfElseIf() {
		
		
		if(a==1||a==2||a==3)
		{
			System.out.println("The value of a is in between 1 and 3");
		}
		else if(a==4)
		{
			System.out.println("The values of a is 4");
		}
		else if(a==5)
			System.out.println("The values a is 5");
		else
			System.out.println("The values of a is not between 1 and 5");
		
	}

	public static void main(String[] args) {
		
		new UsingIfElseIf();
		

	}

}
