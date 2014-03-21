package com.cc.ch12.Exceptions;

public class FinalTest4 {

	public static void main(String[] args) {
		System.out.println(test4());  
	}
	
	 public static int test4() {  
	        int b = 20;  
	  
	        try {  
	            System.out.println("try block");  
	  
	            b = b / 0;  
	  
	            System.out.println("continue to execute");
	            return b += 80;  
	        } catch (Exception e) {  
	  
	            b += 15;  
	            System.out.println("catch block");  
	        } finally {  
	  
	            System.out.println("finally block");  
	  
	            if (b > 25) {  
	                System.out.println("b>25, b = " + b);  
	            }  
	  
	            b += 50;  
	        }  
	  
	        return 204;  
	    }  

}
