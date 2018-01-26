package com.tek.general;

public class UsingNested {

	public UsingNested() {
		
		for(int i=0;i<5;i++)
		{
			for(int y=1;y<5;y++)
			{
			
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		new UsingNested();
		
		

	}

}
