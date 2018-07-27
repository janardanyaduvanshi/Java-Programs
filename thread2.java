/* import java.lang.*;
class a implements Runnable
{
	public void run()
	{
		System.out.println("In run method implmentation");
	}
	public static void main(String args[])
	{
		a ab=new a();
		Thread t=new Thread(ab);
		t.start();
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		t.setPriority(10);
		t.setName("Akshay");
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		t.run(); */
		// Java program to demonstrate getPriority() and setPriority()
import java.lang.*;
 
class ThreadDemo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");
    }
 
    public static void main(String[]args)
    {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        ThreadDemo t3 = new ThreadDemo();
 
        System.out.println("t1 thread priority : " +
                              t1.getPriority()); // Default 5
        System.out.println("t2 thread priority : " +
                              t2.getPriority()); // Default 5
        System.out.println("t3 thread priority : " +
                              t3.getPriority()); // Default 5
 
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
         
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
        // t3.setPriority(21); will throw IllegalArgumentException
        System.out.println("t1 thread priority : " +
                              t1.getPriority());  //2
        System.out.println("t2 thread priority : " +
                              t2.getPriority()); //5
        System.out.println("t3 thread priority : " +
                              t3.getPriority());//8
 
        // Main thread
        System.out.print(Thread.currentThread().getName());
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority());
 
        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    //thread name 
	    System.out.println("t1 thread priority : " +t1.getName());
        System.out.println("t1 thread priority : " +t2.getName ());
        System.out.println("t1 thread priority : " +t3.getName());		
	}
}
/* 	}
} */