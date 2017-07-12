package com.Michael;

public class Outer
   {
       
	   public int a = 1;
       private int b = 2;
       
       public void another(int g){
    	   
       }
       
       public int method(final int c)
       {
           int d = 3;
           
            
           
           
             class Inner
           {
               private void iMethod(int e)
               {
                   // Becusue non static the inner class hasd access to all the variable of the enclosing object. 
            	   // It only has access to the enclosing method variables if these variables marked as final
            	   
            	     int w = e;
                     int y = a;
                     int z = b;
                     int s = c;
                     int t = d;
                    
                     
                     System.out.println("  d  " +d);
                    		 
               }
           }
            
            return d;
       }
   }
