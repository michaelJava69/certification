package com.Michael;

public class ThrowsDemo 
{  
          static void throwMethod() throws IllegalAccessException 
        {  
                      System.out.println("Inside throwMethod.");  
                      throw new IllegalAccessException("demo");  
              }
  
    public static void main(String args[]) 
    {  
                   try 
        {  
                         throwMethod();  
                   } 
        catch (IllegalAccessException e) 
        {  
                         System.out.println("Caught " + e);  
                         Boolean b = new Boolean("TRUE");
                         
                         if(b.booleanValue())
                         {
                             System.out.println("Yes : " + b);
                         }
                         else
                         {
                             System.out.println("No : " + b);
                         }
                         
                         
                         
                         
                         

                   }  
                   
                   
                   
           }  
    
    


}