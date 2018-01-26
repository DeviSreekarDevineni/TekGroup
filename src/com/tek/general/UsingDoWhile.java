package com.tek.general;

public class UsingDoWhile {
	
	private int i=10;

	public UsingDoWhile() {
		
		do {
			System.out.println("The value of x is :"+i);
			i--;
		}while(i>5);
		
	}

	public static void main(String[] args) {
		
		new UsingDoWhile();

	}

}
