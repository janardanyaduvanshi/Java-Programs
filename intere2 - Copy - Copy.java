interface a
{
	void m();
	void s();
}
interface b
{
	void d();
}
class imp implements a,b
{
	public void m()
	{
		System.out.println("In m");
	}
	public void s()
	{
		System.out.println("In s");
	}
	public void d()
	{
		System.out.println("In d");
	}
	public static void main(String args[])
	{
		imp i=new imp();
		i.m();
		i.s();
		i.d();
	}
}