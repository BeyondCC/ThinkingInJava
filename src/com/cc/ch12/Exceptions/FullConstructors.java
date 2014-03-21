package com.cc.ch12.Exceptions;

class MyException extends Exception{

	public MyException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyException(Throwable cause) {
		super(cause);
	}

	public MyException() {
	}

	public MyException(String message) {
		super(message);
	}
	
}
public class FullConstructors {
	
	public static void f() throws MyException{
		System.out.println("Throwing myexception from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("Throwing myexception from g()");
		throw new MyException("this is in g");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			g();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
