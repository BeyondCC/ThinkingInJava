package com.cc.ch15.Generics;
/**
 * 
 */


class Atombile{
	
}
public class Holder3<T> {
	
	private T a;
	public Holder3(T a) { this.setA(a);}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder3<Atombile> holder = new Holder3<Atombile>(new Atombile());
		
		Atombile atom = holder.getA();  // here is no cast, because the declaration is <Atombile>
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

}
