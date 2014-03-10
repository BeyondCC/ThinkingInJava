package com.cc.ch10.InnerClass;

public class InnerClass {

	private String str = "abc";

	public static void main(String[] args) {

		InnerClass cls = new InnerClass();
		Hello hello = cls.new Hello();

		System.out.println(hello.getString());

		C c = contents();
		c.say();

		// cannot access the private class B
		// A.B b = a.new B();
	}

	public static C contents() {
		return new C() {
			public void say() {
				System.out.println("this is annoy A");
			}
		};
	}

	class Hello {

		public String getString() {
			return str;
		}
	}

}

class C{
	
	public void sayHello(){
		System.out.println("hello,C");
	}
}

class A {

	protected class B {

		void say() {
			System.out.println("hello");
		}
	}

	B getB() {
		class C {
			int a;

			public void say() {
				System.out.println("hi");
			}
		}
		return new B();
	}

	public void say() {
		System.out.println("this is A");
	}
}