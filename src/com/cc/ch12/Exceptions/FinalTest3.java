package com.cc.ch12.Exceptions;

public class FinalTest3 {

	public static void main(String[] args) {
		System.out.println(f());
	}
	
	public static int f(){
		int b = 0;
		
		try{
			  b  = b/0; 
		}catch(Exception e){
			  return b +=10;
		}finally{
			 return b+=20;
		}
	}

}
