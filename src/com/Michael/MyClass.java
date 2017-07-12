package com.Michael;

class MyClass
{
  
	
	static private int myCount = 0;
    int yourNumber;
   
    private static synchronized int nextCount()
    {
        return ++myCount;
    }
        
    public void getYourNumber()
    {
        yourNumber = MyClass.nextCount();
    }	
	
	
	
	
 void myMethod(int i) {System.out.println("int version  "  + i);}
  void myMethod(String s) {System.out.println("String version");}
  public static void main(String args[])
  {
      
	  //bsilfd
	  // Char is always widened to int when stored
	  //0064
	  
	  MyClass obj = new MyClass();
      char ch = 'c';
      obj.myMethod(ch);
 }

}