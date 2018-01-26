package com.tek.general;

public class UsingSwitch3 {
	
	private String s="Sreekar";

	public UsingSwitch3() {
		
		
		
		switch(s)
		{
		case "Deva" : System.out.println("The given name is Deva");
		break;
		case "Sreekar": System.out.println("The given name is Sreekar");
		break;
		default : System.out.println("The give name is not Deva and Srekar");
		break;
		}
		
	}

	public static void main(String[] args) {
		
		new UsingSwitch3();
	}

}
