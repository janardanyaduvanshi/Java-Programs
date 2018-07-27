class th
{
	static void m(int a)
	{
	 System.out.println("in m "+a);	
	}
}
class the extends th
{
	static void m(float m)
	{
	 System.out.println("in m second"+m);	
	}
	public static void main(String args[])
	{
		/* the t=new the();
		t.m();
		t.m(); */
		th.m(78);
	}
}


/*
    public static void main()
	{
		System.out.println("bye");
	}
	public static void main(String args[])
	{
		System.out.println("hi");
		th t=new th();
		t.main();
	}*/