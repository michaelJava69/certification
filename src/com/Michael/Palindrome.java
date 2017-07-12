package com.Michael;

public class Palindrome {
    public static boolean isPalindrome(String word) {
         
        
    	 
        
    	  	
         char[] countArray = word.toCharArray();
    	    		   
    	 char[] newArray  = new char[countArray.length ]; 
   	     
    	 
    	 System.out.println("countArray.length  " + new String(countArray) );
    	 
   	     for (int i = countArray.length-1; i>=0; i--)
   	    	 try {
   	    		 System.out.println("Before " +  countArray[i] );
   	    		 newArray[countArray.length-1- i] = countArray[i];
   	    	 }catch(StringIndexOutOfBoundsException e){
   	    		 System.out.println("Index error" + i + "not range");
   	    	 }
   	         
   	        System.out.println("new  " + new String(newArray));
        	System.out.println("old " + new String(countArray));
   	     
   	
   	       String  cstr1 = new String(countArray);    
   	       String  cstr2 = new String(newArray);
   	     
   	       if (cstr2.compareToIgnoreCase(cstr1) ==0){
   	    	   
   	    	   return true;
   	       }else{
   	    	   return false;
   	       }
        
        }
    
    
    public static boolean isPalindrome2(String word) {
        
        
   	 
        
	  	
        //char[] countArray = word.toCharArray();
   	    		   
   	 char[] newArray  = new char[word.length() ]; 
  	     
   	 
   	 //System.out.println("countArray.length  " + new String(countArray) );
   	 
  	     for (int i = word.length()-1; i>=0; i--)
  	    	 try {
  	    		 System.out.println("Before " +  word.charAt(i) );
  	    		 newArray[word.length()-1- i] = word.charAt(i);
  	    	 }catch(StringIndexOutOfBoundsException e){
  	    		 System.out.println("Index error" + i + "not range");
  	    	 }
  	         
  	        System.out.println("new  " + new String(newArray));
       	    System.out.println("old " + word);
  	     
  	
  	       //String  cstr1 = new String(countArray);    
  	       String  cstr2 = new String(newArray);
  	     
  	       if (cstr2.compareToIgnoreCase(word) ==0){
  	    	   
  	    	   return true;
  	       }else{
  	    	   return false;
  	       }
       
       }
    
    
    public static void main(String[] args) {
       
    	String m;
    	if (args.length<=0 )	
    		 m = "Deleveled";
        else {
	        
	          m = args[0];
        }
    	
    	System.out.println( m);
    	System.out.println(Palindrome.isPalindrome2(m));
        
       
        
        
        
        
        
    }
}
