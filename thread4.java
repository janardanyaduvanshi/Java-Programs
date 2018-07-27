//import java.lang.Thread;
class abc implements Runnable
{
	public void run()
	{
		System.out.println("In the run");
	}
	public void runone()
	{
	 System.out.println("2nd method in run");	
	} 
}
class func
{
	public static void main(String args[])
	{
		abc a=new abc();
		Thread t=new Thread(a);
		t.start();
		t.runone();
		System.out.println("priority change  "+t.getPriority());
		t.setPriority(7);
		System.out.println("New priority  "+t.getPriority());
		System.out.println("Set new thread name");
		System.out.println("get name  "+t.getName());
		t.setName("name changed");
		System.out.println("new name  "+t.getName());
	}
}

/*  public void run()
	{
	 System.out.println("2nd method in run");	
	}  */