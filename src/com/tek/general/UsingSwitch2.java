package com.tek.general;

public class UsingSwitch2 {

	public UsingSwitch2() {
		for(int i=0;i<5;i++)
		{
			switch(i)
			{
			case 0:
			case 1:
			case 2:
				System.out.println("The values are less than 3");
				break;
			case 3:
			case 4:
			    System.out.println("The values are either 3 or 4");
			    break;
			    default: System.out.println("The values are grater than 5");
			    break;
			}
		}
	}

	public static void main(String[] args) {
		
		new UsingSwitch2();

	}

}
