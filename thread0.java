import java.lang.*;
class abc extends Thread
{
	void run()
	{
		System.out.println("hi in run method");
	}
	public static void main(String args[])
	{
		abc a=new abc();
		a.start();
	}
}