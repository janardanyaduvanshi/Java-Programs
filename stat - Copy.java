class test
{
	default
	{
		System.out.println("IN default");
	}
	static 
	{
		System.out.println("IN STATIC");
	}
	{
		System.out.println("IN initalize block");
	}
	public static void main(String args[])
	{
       // test t=new test();
	}
}