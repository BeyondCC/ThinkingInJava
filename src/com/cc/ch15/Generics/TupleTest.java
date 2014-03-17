package com.cc.ch15.Generics;

public class TupleTest {

	public static TwoTuple<Integer, String>  getTwoTuple(){
		return new TwoTuple<Integer, String>(3, "3");
	}
	public static void main(String[] args) {
		TwoTuple<Integer, String> two = getTwoTuple();
		System.out.println(two.toString());
		
		
	}

}
