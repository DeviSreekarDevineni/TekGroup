package com.tek.general;

public class Prime {
	
	private int number=7;
	private int increment;
	

	public Prime() {
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				increment++;
			}
		}
		if(increment==2)
		{
			System.out.println("It is a prime");
		}
		
		
	}

	public static void main(String[] args) {
		
		new Prime();

	}

}
