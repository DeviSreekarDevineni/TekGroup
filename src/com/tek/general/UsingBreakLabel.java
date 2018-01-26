package com.tek.general;

public class UsingBreakLabel {
	
	private int i=1;

	public UsingBreakLabel() {
		
		First:{
		Second:{
		Third:{
		System.out.println("This is Third label");
		if(i==1) break Second;
		
	}System.out.println("This is second label");
	}System.out.println("This is First label");
	}
	}
		
	
	

	public static void main(String[] args) {
		
		new UsingBreakLabel();
		
		
		

	}

}
