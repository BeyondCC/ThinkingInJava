package com.cc.ch6.accesscontrol;

public class Maint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.judge();
	}

}


class Base{
	
	protected int a = 3;
	
	protected void f(){
		System.out.println("this is base");
	}
}

class Child extends Base{
	
	public void judge(){
		f();
	}
}