package com.cc.ch21.concurrency;

public class EvenGenerator extends IntGenerator {

	private int currentEvenValue = 0;
	@Override
	synchronized public int next() {
		++currentEvenValue; //Danger point here ++ is not atomitc.
//		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenChecker.test(new EvenGenerator());
	}

}
