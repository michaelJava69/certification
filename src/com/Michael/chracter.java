package com.Michael;

public class chracter {
	
	
	static void main(String args[]){
		
	     int[] countArray = new int [Character.MAX_VALUE];
	     String str = "You cannot touch me!";
	     
	     
	     for (int i =0; 1< str.length(); i++)
	    	 try {
	    		 countArray[str.charAt(i)]++;
	    	 }catch(StringIndexOutOfBoundsException e){
	    		 System.out.println("Index error" + i + "not range");
	    	 }
	         for (int i =0; 1< countArray.length; i++)
	        	  if (countArray[i] !=0)
	        		  System.out.println((char)i + ": " + countArray[i]);
	}    

}
