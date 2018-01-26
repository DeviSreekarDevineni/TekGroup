package com.tek.general;

public class UsingForBlock {
	
	private void method()
	{
	   for(int x=0;x<5;x++)
	   {
		  
		   for(int y=5;y>0;y--)
		   {
			   System.out.println("The value of X is :"+x);
			   System.out.println("The value of Y is :"+y);
		   }
	   }
	}

	public static void main(String[] args) {
		
		UsingForBlock m=new UsingForBlock();
		m.method();
		

	}

}
