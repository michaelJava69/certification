package com.Michael;

class Base 
{
    int i = 99;
    public void amethod()
    {
        System.out.println("Base.amethod()");
    }
            
    Base()
    {
        amethod();
    }
}
public class Derived extends Base
{
    int i = -1;
        
    public static void main(String argv[])
    {
        
    	// *********************************************************************************************
    	// There will be a super.contrucvtor call  (1)
    	// The primitive type referred to by the handle will (2)
    	// be the value of the handle
    	// the method type will refer to the method in the class type rather than handle because overridden   (1)
    	//******************************************************************************
    	
    	Base b = new Derived();    //1
        System.out.println(b.i);   //2
        b.amethod();              //1
    }
    
    public void amethod()
    {
        System.out.println("Derived.amethod()");
    }
}
