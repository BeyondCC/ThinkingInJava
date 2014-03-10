package com.cc.ch9.interfacee;

public class TestInterface implements CanFlight, CanFlightToo, child.B {

	public static void main(String[] args) {
		CanFlight flight = new TestInterface();
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}


}

abstract class AbstractClass {
	public void f() {
		System.out.println("f");
	}

	abstract public void hello();
}

class child extends AbstractClass {

	@Override
	public void hello() {
		System.out.println("child say hello");
	}
	
	public void fly(){
		System.out.println("child fly");
	}
	
	interface B{
		void say();
	}
}

interface CanFlight {
	int a = 5;
	void fly();
}

interface CanFlightToo{
	void fly();
}