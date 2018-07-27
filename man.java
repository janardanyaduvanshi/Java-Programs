class man
{
	void div() 
	{
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		throw new Exception("exception occur");
		System.out.println("div occure");
		}
		catch(Exception e)
		{
		System.out.println("catch in first");	
		}
	}
	public static void main(String args[])
	{
		many m=new many();
		try
		{
			m.div();
		}
		catch(Exception e)
		{
			System.out.println("catch method occur");
		}
	}
}