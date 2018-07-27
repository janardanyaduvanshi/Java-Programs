class many
{
	void div() throws Exception
	{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("div occure");
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