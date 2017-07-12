package com.Michael;

 public class Test {
	 
	 public static void main(String argv[]) { 
		 Test t = new Test(); 
		 t.first();
		 
		  Test1[] t1 = new Test1[10];
         Test1[][] t2 = new Test1[5][];
         if (t1[0] == null)
         {
            t2[0] = new Test1[10];    
            t2[1] = new Test1[10];    
            t2[2] = new Test1[10] ;   
            t2[3] = new Test1[10] ;   
            t2[4] = new Test1[10];    
         }
         System.out.println(t1[0]);
         System.out.println(t2[1][0]);
		  
   } 
	 
	 public void first() { 
		 int i = 5; 
		 Value v = new Value();
		  v.i = 25; 
		second(v, i); 
		 System.out.println(v.i);
	
	 } 
	 
	 public void second(Value v, int i) 
	 
	 { 
	   i = 0;
	    v.i = 200; 
	   Value val = new Value();
	    v = val; 
	    
	    System.out.println(v.i + " " + i); 
	
	 } 
	 
 
 } 
 
 
 class Value { 
	 
	 public int i = 15; 
 
 }  
   
   
   