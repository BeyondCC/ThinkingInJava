package com.cc.ch5.InitAndClean;

class Window {
	Window(int i) {
		System.out.println("window: " + i);
	}
	
	public void variAgs(String ... args){
		for(String s : args)
			System.out.println(s);
	}
}

class Rock {
	
	static Window w5 = new Window(5);

	Window w1 = new Window(1);

	private int num;
	private int[] arr = {1, 2 ,3, 5,};

	public Rock(int num) {
		this.num = num;
		w3 =  new Window(4);
	}

	Window w2 = new Window(2);

	public Rock(int num, int count) {
		this(num);

	}

	Window w3 = new Window(3);

	public int f(int a) {
		System.out.println(a);
		// this(num); wrong
		// i++; i should be init
		return 1;
	}

	public static void sayHi() {
		// f(3); wrong
		// num = 3; this.num = 3 wrong
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rock rock = new Rock(); this is wrong

		double d = 2.4;
		byte a = 4;
		Rock rock = new Rock(5);
//		rock.f('a');
//		rock.f(a);
		Window w1 = new Window(1);
		w1.variAgs(new String[]{"123", "456", "567"});
	}

}
