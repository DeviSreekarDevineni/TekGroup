package com.tek.general;

import java.util.Scanner;

public class UsingDoWhile2 {
	
	
	private int choice;
	
	
	public UsingDoWhile2(int a, int b) {
		
		do {
			
			System.out.println("1.Add");
			System.out.println("2.Subract");
			System.out.println("3.Multiply");
			System.out.println("Enter ur choice:");
			Scanner s=new Scanner(System.in);
			 choice=s.nextInt();
			s.close();
		}while(choice < 1||choice > 3);
		
		
		switch(choice)
		{
		case 1: System.out.println("The addition of two numbers is "+(a+b));
		break;
		case 2:System.out.println("The subraction of two numbers is "+(a-b));
		break;
		case 3:System.out.println("The Multiplication of two numbers is "+(a*b));
		break;
		
		
		}
		
		
		
	}

	public static void main(String[] args) {
		new UsingDoWhile2(5,6);

	}

}
