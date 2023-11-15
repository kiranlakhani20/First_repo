package com.training.example.JacocoExample;
public class Palindrome2 {
	
	public boolean isPalindrome(String inputString) {
	    if (inputString.length() == 0) {
	        return true;
	    } else {
	    	String rev = "";
			String rev2 = "";
	    	int length = inputString.length();
	    	 
	        for ( int i = length - 1; i >= 0; i-- )
	           rev = rev + inputString.charAt(i);
	   		//check rev string
	        if (inputString.equals(rev))
	           return true;
			else if (inputString.equalsIgnoreCase(rev))
	           return true;
	        else
	           return false;
			
	    }
	}
}
