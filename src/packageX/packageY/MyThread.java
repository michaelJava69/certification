package packageX.packageY;

public class MyThread implements Runnable 
{ 
    String myString = "Yes "; 
    public void run() 
    { 
       
    	try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	this.myString = "No "; 
    } 
    public static void main(String[] args) 
    { 
        MyThread t = new MyThread(); 
        
        //Signals thread to start however comes out immediately to proceed with rest of code  
        new Thread(t).start(); 
       
        for (int i=0; i < 10; i++) 
        System.out.print(t.myString); 
    } 
}
