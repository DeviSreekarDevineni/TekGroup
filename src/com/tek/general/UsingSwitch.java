package com.tek.general;

public class UsingSwitch {

	public UsingSwitch() {
		for(int i=0;i<3;i++)
		{
			switch(i)
			{
			
			case(0): System.out.println("The value of i is 0");
			break;
			case(1): System.out.println("The value of i is 1");
			break;
			default:  System.out.println("The default statement is printed");
			break;
			
			
			}
		}
	}

	public static void main(String[] args) {
		
		new UsingSwitch();

	}

}
