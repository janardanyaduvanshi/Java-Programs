interface a
{
	void m1();
}
class b implements a
{
	public void m1()
	{
		System.out.println("Hi");
	}
	static public void main(String... ar)
	{
		b bb=new b();
		bb.m1();
	}
}