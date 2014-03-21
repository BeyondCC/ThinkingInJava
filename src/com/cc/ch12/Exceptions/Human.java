package com.cc.ch12.Exceptions;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {
	public static void main(String[] args) {
		// Catch the exact type:
		try {
			throw new Annoyance();
		} catch (Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
	}
}
