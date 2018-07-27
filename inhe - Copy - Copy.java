import java.util.*;


class Super
{
	String quer;
    void m1()
    {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the query\n");
	 quer=sc.nextLine();
	 //query=quer;
    }
}




class Second extends Super
{
	int onroad,rto,sum;
	void m2()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the on road and rto amount");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=a+b;
	 onroad=a;
	 rto=b;
	 sum=c;
	}
	void show()
  {
	  System.out.println("Query is "+quer);
	  System.out.println("On-road value "+onroad+" rto value  "+rto+"  sum of both  "+sum);
  }
}

class Third extends Second
{
	public static void main(String args[])
	 {
		 Third c=new Third();
		 c.m1();
		 c.m2();
		 c.show();
	 }	 
    
}