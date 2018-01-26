package com.tek.general;

public class UsingContinueLabel {

	public UsingContinueLabel() {
		
		First:for(int i=0;i<10;i++)
		{
			for(int y=0;y<10;y++)
			{
				if(y>i)
				{
					System.out.println();
					continue First;
				}
				System.out.print(y);
			}
			
		}
	}

	public static void main(String[] args) {
		
		new UsingContinueLabel();

	}

}
