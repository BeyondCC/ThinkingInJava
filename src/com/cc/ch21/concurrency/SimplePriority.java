package com.cc.ch21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriority implements Runnable {

	private int countDown = 5;
	private volatile double d; // No optimization
	private int priority;

	public SimplePriority(int priority) {
		this.priority = priority;
	}

	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}

	public void run() {
		Thread.currentThread().setPriority(priority);
		while (true) {
			// An expensive, interruptable operation:
			for (int i = 1; i < 100000; i++) {
				d += (Math.PI + Math.E) / (double) i;
				if (i % 1000 == 0)
					Thread.yield();
			}
			System.out.println(this);
			if (--countDown == 0)
				return;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++)
			exec.execute(new SimplePriority(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriority(Thread.MAX_PRIORITY));
	}

}
