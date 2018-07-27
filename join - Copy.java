class abc implements Runnable
{
	public void run()
	{
		try
		{
		for(int i=0;i<=3;i++)
		{
		System.out.println("HI in RUN 1");
		Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class bcd implements Runnable
{
	public void run()
	{
		try
		{
		for(int i=0;i<=3;i++)
		{
			System.out.println("HI in run 2");
			Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class cde 
{
	public static void main(String args[])throws InterruptedException
	{
		abc a=new abc();
		Thread t=new Thread(a);
		bcd b=new bcd();
		Thread t1=new Thread(b);
		t.start();
		t.join();
		t1.start();
	}
}