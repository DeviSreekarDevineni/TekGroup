package com.tek.general;

public class UsingForEach3 {
	
	private int a[]= {5,7,6,3,8,9,1}; 
	private int value=5;

	public UsingForEach3() {
		
		for(int aa:a)
		{
			if(aa==value)
			{
				System.out.println(value+" is found in the array");
			}
		}
		
	}

	public static void main(String[] args) {
		
		new UsingForEach3();

	}

}
