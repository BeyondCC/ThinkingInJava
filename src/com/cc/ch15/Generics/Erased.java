package com.cc.ch15.Generics;

public class Erased<T> {
	
	private final  int  SIZE = 100;

	public static void f(Object obj){
	//	if(obj instanceof T){} error
	//	T var = new T();  error because of the erasure
	//	T[] array = (T)new Object[SIZE];  error
	}
	public static void main(String[] args) {

	}

}
