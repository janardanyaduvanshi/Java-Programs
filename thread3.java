//import java.lang.Thread;
class abc extends Thread
{
	public void run()
	{
		System.out.println("In the run");
	}
}
class fun
{
	public static void main(String args[])
	{
		abc a=new abc();
		a.start();
	}
}