package com.Michael;

import java.io.*; 

class Write 
{ 
    public static void main(String[] args) throws Exception 
    { 
        File file = new File("temp.txt"); 
        FileOutputStream stream = new FileOutputStream(file); 
        // write integers here. . . 
       
        DataOutputStream filter = new DataOutputStream(stream); 
        for (int i = 0; i < 10; i++) 
        {
            filter.writeInt(i); 
        }
       
       //File 
       //FileOutput stream
       //DataOutput stream 
        
   
        
    }
}
