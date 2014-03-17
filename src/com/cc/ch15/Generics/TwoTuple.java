package com.cc.ch15.Generics;

public class TwoTuple<A, B> {
	
	public final A first;
	public final B second;
	
	
	public TwoTuple(A first, B second) {
		this.first = first;
		this.second = second;
	}
	
	
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}

}
