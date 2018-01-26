package com.tek.general;

public class UsingForEach2 {
	
	private int[] a= {1,2,3,4,5,6,7,8};

	public UsingForEach2() {
		
		for(int aa:a)
		{
			System.out.println(+aa);
			if(aa>5)
				break;
		}
		
		
	}

	public static void main(String[] args) {
		
		new UsingForEach2();

	}

}
