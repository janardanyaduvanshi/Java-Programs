class thro
{
	void m() throws ArithmeticException
	{
		int a=10/0;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		thro t=new thro();
		try
		{
		t.m();
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
		}
	}
}