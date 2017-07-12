package com.Michael;

public class Static
{
	static
    {
        int  x = 5;    // this is anothe x not related to other x.
    }
    static int x,y;
    
    // Therefopre x = 0 , y = 0
    // 
    public static void main(String args[])
    {
                x--;
                System.out.println( " value x " +x);
        myMethod();
                System.out.println(x + y + ++x);
    }
    
    
    
    public static void myMethod()
    {
         y = x++ + ++x;
    }
}
