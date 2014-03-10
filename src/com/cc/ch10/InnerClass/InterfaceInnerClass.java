package com.cc.ch10.InnerClass;

 interface ClassInterface {
	 void hello();
	public class InterfaceInnerClass implements ClassInterface {

		public static void main(String[] args) {
			new InterfaceInnerClass().hello();
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			System.out.println("hello");
		}

	}

}
