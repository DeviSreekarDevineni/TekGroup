package com.tek.general;

public class UsingBrake3 {

	public UsingBrake3() {
		
		for(int i=0;i<10;i++)
		{
			for(int y=0;y<10;y++)
			
				System.out.print("*");
				
			System.out.println();
			if(i==2)
				break;
		
		}
		
		
	}

	public static void main(String[] args) {
		
		
		new UsingBrake3();

	}

}
