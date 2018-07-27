class demo
{   
    int res,resu;
	public int m1(int a,int b)
	{
		res=a+b;
		return(res);
	}
	public long m1(int x,int y,int z)
	{
		resu=x+y+z;
		return(resu);	
	}
	public void show()
	{
		System.out.println(res);
        System.out.println(resu);

	}
	public static void main(String args[])
	{
		demo d=new demo();
		d.m1(10,20);
		d.m1(20,30,40);
		d.show();
	}
}