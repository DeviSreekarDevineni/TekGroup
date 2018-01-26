package com.tek.general;

public class UsingBreak {


	public UsingBreak() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(i==5)
				break;
		}
		
	}

	public static void main(String[] args) {
		
		new UsingBreak();

	}

}
