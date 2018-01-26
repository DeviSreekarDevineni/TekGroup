package com.tek.general;

public class UsingBreakLabel2 {

	public UsingBreakLabel2() {
		
		outer: for(int i=1;i<10;i++)
		{
			for(int y=1;y<10;y++)
			{
				System.out.println(y);
			if(y==9)
				break outer;
			}	
		}
		
	}

	public static void main(String[] args) {
		
		new UsingBreakLabel2();

	}

}
