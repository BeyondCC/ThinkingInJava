package com.cc.ch21.concurrency;

public class Joining {

	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("sleepy", 1500);
		Sleeper cc = new Sleeper("cc", 1500);
		
		Joiner join = new Joiner("join", sleepy);
		Joiner dd = new Joiner("dd", cc);
		
		cc.interrupt();
	}

}

class Sleeper extends Thread{
	
	private int duration;
	
	public Sleeper(String name, int sleepTime) {
		super(name);
		this.duration = sleepTime;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + "was interrupted." +
									" is interrupted(): " + isInterrupted());
		}
		
		System.out.println(getName() + " has awakened!");
	}
}

class Joiner extends Thread{
	private Sleeper sleeper;
	
	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}

	public void run(){
		try {
			//joiner block until sleeper finish its execution
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		System.out.println(getName() + " join completed");
	}
}