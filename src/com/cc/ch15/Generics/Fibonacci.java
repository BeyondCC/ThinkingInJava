package com.cc.ch15.Generics;

import com.cc.util.Generator;

public class Fibonacci implements Generator<Integer> {

	private int count = 0;
	
	private int fib(int n ){
		if(n < 2) return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}
	
	public static void main(String[] args){
		Fibonacci gen = new Fibonacci();
		
		for(int i = 0; i < 18; i++)
			System.out.println(gen.next() + " ");
	}

}
