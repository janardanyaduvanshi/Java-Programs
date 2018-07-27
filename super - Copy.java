class a
{
	void a1()
	{
		System.out.println("hi in one");
	}
}
class b extends a
{
	b(int b)
	{
		System.out.println("hi in 2  "+b);
		super.a1();
	}
	public static void main(String args[])
	{
		b bb=new b(18);
		//bb.m();
	}
}