package com.cc.ch12.Exceptions;

public class MultipleReturns {
	
	public static void f(int i ){
		System.out.println("Initialization that require cleanup");
		
		try{
		System.out.println("Point 1");
		if(i == 1) return;
		System.out.println("Point 2");
		if(i == 2) return;
		System.out.println("Point 3");
		if(i == 3) return;
		System.out.println("end");
		}finally{
			System.out.println("perform cleanup");
		}
	}


	public static int testReturn(){
		
		try{
			return 1;
		}finally{
			return 2;
			//System.out.println("haha");
		//	return 2;
		}
	}
	public static void main(String[] args) {

		for(int i = 0; i < 4; i++)
			f(i);
		
		System.out.println(testReturn());
	}

}
