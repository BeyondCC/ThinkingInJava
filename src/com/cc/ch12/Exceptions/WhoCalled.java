package com.cc.ch12.Exceptions;

public class WhoCalled {

	public static void f(){
		
		try {
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste : e.getStackTrace()){
				System.out.println(ste.getMethodName());
			}
		}
	}
	
	static void g() {f();}
	static void h() {g();}
	
	public static void main(String[] args) {
		//e.printStackTrace
		// it print the call chain of error position
		f();
		System.out.println("=====================");
		g();
		System.out.println("=====================");
		h();
	}

}
