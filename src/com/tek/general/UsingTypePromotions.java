package com.tek.general;

public class UsingTypePromotions {
	
	private byte b=21;
	private char c='a';
	private int i=10;
	private float f=10.5f;
	private double d=22.00055;

	public UsingTypePromotions() {
		
		
		int i1=(i*c);
		System.out.println("The product of integer and character is :"+i1);
		double d1=(b/c)+(i*f)-(d/i1);
		System.out.println("The value of double is :"+d1);
		
		
	}

	public static void main(String[] args) {
		
		new UsingTypePromotions();
		
		
		
	}

}
