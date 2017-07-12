package com.Michael;

public class AssertTest
{
    public void methodA(int i)
    {
    	
    	
    	//expression1 must be a boolean expression.
    	//expression2 must return a value (must not return void).
        
    	assert i >= 0 : methodB();
        System.out.println(i);
    }

    public String  methodB()
    {
        return  new String("The value must not be negative") ;
        
        //return 5;
    }
    
    public static void main(String args[])
    {
        AssertTest test = new AssertTest();
        test.methodA(10); 
    }    
}    

