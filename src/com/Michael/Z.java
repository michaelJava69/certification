package com.Michael;

class X 
{
	
	//variables intialized first then contructor intiaalized
	  
    Y b = new Y();
    
    X() 
    {   
        System.out.print("X"); 
    }
}

class Y 
{
    Y() 
    { 
        System.out.print("Y"); 
    }
}
public class Z extends X 
 {
    Y y = new Y();
    //wHEN DELARING CLASSES WITH DEFAULT CONSTRUCTOR THEN SUPER.CONRTUCTOR IS IMPLICITELY CALLED
    //HENCE BEFORE Z() CALLED X CALLED
    
    // OUTPUT YXYZ
    
    Z() 
    { 
        System.out.print("Z"); 
    }
    public static void main(String[] args) 
    {
           new Z();
    }
}
