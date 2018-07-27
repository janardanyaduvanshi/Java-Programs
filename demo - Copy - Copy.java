import java.util.*;
class demo
{
	Scanner sc=new Scanner(System.in);
	String name;
	int rollnu,java,c,cplus,per,sum,count=0;
	void enter_req() throws Exception
	{
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Enter the roll nu");
		rollnu=sc.nextInt();
	}
	void enter_de()
	{
		System.out.println("Enter the marks of Java");
		java=sc.nextInt();
		check_java();
		System.out.println("Enter the marks of C");
		c=sc.nextInt();
		check_c();
		System.out.println("Enter the marks of C++");
		cplus=sc.nextInt();
		check_cplus();
	}
	void check_java()
	{
		while(java>100 || java<0)
		{
			System.out.println("Please enter correct marks");
			java=sc.nextInt();
		}
	}
	void check_c()
	{
		while(c>100 || c<0)
		{
			System.out.println("Please enter correct marks");
			c=sc.nextInt();
		}
	}
	void check_cplus()
	{
		while(cplus>100 || cplus<0)
		{
			System.out.println("Please enter correct marks");
			cplus=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("Result are");
		System.out.println("java:-  "+java);
		System.out.println("c:-     "+c);
		System.out.println("cplus:- "+cplus);
	}
	void check_mar()
	{   
	    count=0;
		if(java<33)
		{
		System.out.println("you are failed in java");
        count++;		
		}
		if(c<33)
		{
		System.out.println("you are failed in c");
        count++;		
		}
		if(cplus<33)
		{
		System.out.println("you are failed in cplus");	
		count++;
		}
		System.out.println("total subjects in you are fail:-"+count);
	}
	
	void cal()
	{
		sum=java+c+cplus;
		per=(sum*100)/300;
		if(per>33)
		{
		if(per>33 && per<40)
		{
			System.out.println("You are passed with third division");
			System.out.println("You scored:-"+per+"% marks");
		}
        else if(per>40 && per<70)
		{
			System.out.println("You are passed with second division");
			System.out.println("You scored:-"+per+"% marks");
		}
		else if(per>70 && per<95)
		{
			System.out.println("You are passed with first division");
			System.out.println("You scored:-"+per+"% marks");
		}
		else if(per>95 && per<100)
		{
			System.out.println("You are in merit party at home ");
			System.out.println("You scored:-"+per+"% marks");
		}
		}
		else
		{
			System.out.println("Sorry u Are NOt Passed");
			System.out.println("You scored:-"+per+"% marks");
		}
	}
		
		public static void main(String args[])
		{
			demo d=new demo();
			try
			{
			while(true)
			{
			d.enter_req();
			d.enter_de();
			d.display();
			d.cal();
			d.check_mar();
			}
			}
			catch(Exception e)
			{
			System.out.println("\n\n");
			}
		}
}