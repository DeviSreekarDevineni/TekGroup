package com.tek.general;

public class UsingContinue {

	public UsingContinue() {
		
		for(int i=0;i<=10;i++)
		{
			if(i%2==1)
				continue;
			System.out.println(i);
			
		}
			
		
	}

	public static void main(String[] args) {
		
		new UsingContinue();

	}

}
