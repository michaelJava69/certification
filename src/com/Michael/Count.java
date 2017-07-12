package com.Michael;

public class Count {
	
	
	public static void main(String args[]){
		
	     int[] countArray = new int [Character.MAX_VALUE];
	     String str = "You cannot touch me!";
	     
	     
	     
	     
	     for (int i =0; i< str.length(); i++)
	    	 try {
	    		 System.out.println("Before " +  str.charAt(i) + " "+countArray[str.charAt(i)]);
	    		 countArray[str.charAt(i)]++;
	    	 }catch(StringIndexOutOfBoundsException e){
	    		 System.out.println("Index error" + i + "not range");
	    	 }
	         for (int i =0; i< countArray.length; i++){
	        	  //System.out.println( i + ": ");
	        	  if (countArray[i] !=0){
	        		  System.out.print( i + ": ");
	        		  System.out.println((char)i + ": " + countArray[i]);
	        	  }
	        	  
	         }
	}    

}
