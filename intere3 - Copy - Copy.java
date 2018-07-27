class a
{
	static void m()
	{
		System.out.println("In m");
	}
} 
class b extends a
{
	static void s()
	{
		System.out.println("In s");
	}
}
class c extends b
{
	static void d()
	{
		System.out.println("In d");
	}
}
class imp extends c
{
	public static void main(String args[])
	{
		imp i=new imp();
		i.m();
		i.s();
		i.d();
		
		//for static call 
		// imp.m();
		// imp.s();
		// imp.d(); 
	}
}