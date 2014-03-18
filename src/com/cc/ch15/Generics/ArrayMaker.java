package com.cc.ch15.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	
	//the erasure make kind to store with Class not Claa<T>
	private Class<T> kind;

	public ArrayMaker(Class<T> kind) {
		this.kind = kind;
	}

	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[]) Array.newInstance(kind, size);
	}

	public static void main(String[] args) {
		ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
		String[] stringArray = stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}

//the output is [null, null, null, null, null, null, null, null, null]
