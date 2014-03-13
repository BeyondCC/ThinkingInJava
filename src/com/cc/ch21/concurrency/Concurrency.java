package com.cc.ch21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Concurrency {

	/**
	 * @param args
	 * thread and main are two independent thread
	 */
	public static void main(String[] args) {

		//in order
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) 
			exec.execute(new LiftOff());
		exec.shutdown();
		
		System.out.println("1111111111");
		
		System.out.println("======================");

		// the result is out of order
		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		
		System.out.println("2222222222");
	}
}

class LiftOff implements Runnable { 
	protected int countDown = 10; // Default 
	private static int taskCount = 0; 
	private final int id = taskCount++; 
	
	public LiftOff() {} 
	public LiftOff(int countDown) { 
	this.countDown = countDown; 
	} 
	
	public String status() { 
		return "#" + id + "(" + 
				(countDown > 0 ? countDown : "Liftoff!") + "), "; 
	} 
	
	public void run() { 
		while(countDown-- > 0) { 
			System.out.print(status()); 
			//Thread.yield(); 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	} 
} 