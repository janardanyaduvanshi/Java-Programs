import java.lang.*;
class abc extends Thread
{
	public void run()
	{
		System.out.println("hi in run method of thread");
	}
}
class ab extends abc
{
	public static void main(String args[])
	{
	ab a=new ab(); 
    a.start();	
	}
}