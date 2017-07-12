package com.Michael;

public class Condition {
	
	
	public static void main (String args[])  {
		
		
		//Promotion to double happens here
		
		int a = 5; 
		System.out.println("Value is - " + ((a < 5) ? 9.9 : 9)); 	 
	
	
	    Outer outer = new  Outer();
	    Value value = new Value();
	   // int b =  value.i ;
	    int g =  outer.method(2); 
	     
	    
	    
	    //OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	     
	    //Inner inner = new  Inner();
	
	    boolean t = true;
	    boolean b = false;
	    boolean c = true;
	    
	    
	    if (t == true)
	        if (b == true)
	        	   
	              if (c == true)        System.out.println("Some things are true in this world");
	                   else             System.out.println("Nothing is true in this world!");
	        	  
	        else if (t && (b = c))      System.out.println("It's too confusing to tell what is true and what is false  now b = "+b);
	    
	        else                        System.out.println("Hey this won't compile");

}
	
}
