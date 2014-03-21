package com.cc.ch12.Exceptions;


class FourException extends Exception {}

public class AlwaysFinaly {

	public static void main(String[] args) {
		System.out.println("Here");
		try{
			System.out.println("the first block");
			try{
				throw new FourException();
			}catch(Exception e){
				//here the exception will be caught 
				//so the next catch won't be executed
				//but the final finally will execute
			}finally{
				System.out.println("finally in the seond ");
			}
		}catch(Exception e){
			System.out.println("catch the fourexception");
		}finally{
			System.out.println("finally in the first block");
		}
	}

}
