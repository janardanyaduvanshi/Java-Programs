class Test
{
	public static void main(String args[])
	{
		String s="abc";
		String s1="abc";
		System.out.println("a=b"+s==s1);
		
		StringBuffer s3=new StringBuffer(s);
		StringBuffer s2=new StringBuffer("abc");
		System.out.println(s3);
		/* Test t=new Test();
		System.out.println(t); */
	}
}