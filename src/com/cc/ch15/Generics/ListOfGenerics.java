package com.cc.ch15.Generics;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {

	private List<T> array = new ArrayList<T>();
	
	public void add(T item){
		array.add(item);
	}
	
	public T get(int index){
		return array.get(index);
	}
	
	public static void main(String[] args) {
		ListOfGenerics<Integer>  list = new ListOfGenerics<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.get(4));
	}

}
