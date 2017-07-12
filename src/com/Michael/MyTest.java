package com.Michael;

class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("MyThread: run()");
    }
   // public void start()
  //  {
   //     System.out.println("MyThread: start()");
  //  }
}
class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("MyRunnable: run()");
    }
    public void start()
    {
        System.out.println("MyRunnable: start()");
    }
}
public class MyTest 
{
    public static void main(String args[])
    {
        MyThread3 myThread  =  new MyThread3();
        MyRunnable myRunnable = new MyRunnable();
       // myRunnable.run();
        Thread thread  =  new Thread(myRunnable);
        //Thread thread  =  new Thread();
        myThread.start();
        thread.start();
    }
}
