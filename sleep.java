class test implements Runnable
{
	public void run()
	{
		for(int i=0; i<=3;i++)
		{
			try
			{
				
	    	System.out.println("hi");
		    Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
		}
	}
}
class fun
{
	public static void main(String args[])throws InterruptedException
	{
		test t=new test();
		Thread t1=new Thread(t);
		t1.start();
	}
}