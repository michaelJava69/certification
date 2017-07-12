package com.Michael;

public class MyThread3 extends Thread
{
    String myName;
    
    MyThread3(String name)
    {
        myName = name;
    }
    
    public void run()
    {
        for(int i=0; i<100;i++)
        {
            System.out.println(myName);
        }
    }
    public static void main(String args[])
    {
        try
        {
            MyThread3 mt1 = new MyThread3("mt1");
            MyThread3 mt2 = new MyThread3("mt2");
            mt1.start();
            mt1.join();
            mt2.start();
        }
        catch(InterruptedException ex)
        {
        }
    }
}
