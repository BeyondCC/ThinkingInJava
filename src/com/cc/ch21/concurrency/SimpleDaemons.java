package com.cc.ch21.concurrency;

public class SimpleDaemons implements Runnable{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 10; i++){
			Thread thread = new Thread(new SimpleDaemons());
			thread.setDaemon(true);
			thread.start();
		}
		
		//the main thread and the daemon thread run separate
		//when the main is over, the all daemon shutdown  
		Thread.sleep(100);
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + " " + this);
		}
	}

}
