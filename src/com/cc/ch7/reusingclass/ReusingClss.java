package com.cc.ch7.reusingclass;

public class ReusingClss {

	public static void main(String[] args) {
		
		F f = new F();
		

		//the public field can not be poly
		Cartoon cartoon = new Cartoon();
		System.out.println("field: " + cartoon.field);
		cartoon.f();
		
		Draw draw = new Cartoon();
		System.out.println("field: " + draw.field);
		draw.f();
	}

}


class Art{
	Art(){
		System.out.println("this is art");
	}
}

class Draw extends Art{
	
	public int field = 3;
	
	Draw(){
		System.out.println("draw");
	}
	
	public static void f(){
		System.out.println("draw f");
	}
}

class Cartoon extends Draw{
	
	public int field = 4;
	
	private final int i ;  //blank final
	
	public static final int b = 3;
	public Cartoon() {
		i = 3;
		System.out.println("cartoon");
	}
	
	public static void f(){
		System.out.println("cartoon f ");
	}
}

final class A{
	
}

//it is wrong
//class B extends A{
//	
//}

class B{
	B(){
		System.out.println("b");
	}
}

class C{
	C(){
		System.out.println("c");
	}
}

class D{
	D(){
		System.out.println("d");
	}
}

class E{
	private B b = new B();
	E(){
		System.out.println("e");
	}
}
class F extends E{
	
	private C  c= new C();
	F(){
		System.out.println("f");
	}
}