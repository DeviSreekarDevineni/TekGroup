package com.tek.general;

public class UsingReturn {
	
	private int y=0;

	public UsingReturn() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(y==5)
				return;
			y++;
						
		}
			
	}

	public static void main(String[] args) {
		
		new UsingReturn();

	}

}
