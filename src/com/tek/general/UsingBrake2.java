package com.tek.general;

public class UsingBrake2 {
	
	private int i=0;

	public UsingBrake2() {
		
		while(i<10)
		{
			System.out.println(+i);
			if(i==5)
			break;
			i++;
		}
		
	}

	public static void main(String[] args) {
		
		new UsingBrake2();

	}

}
