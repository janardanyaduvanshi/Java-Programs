interface a
{
   default public void m1(); 
}
class InStatic implements a
{
	public void m1()
	{
		System.out.println("hi in m1");
	}
   static public void main(String args[])
   {
	  //InStatic.m1();
	  InStatic is=new InStatic();
      is.m1();	 
   }
}