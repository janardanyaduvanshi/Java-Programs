import java.util.Scanner;
class submit
{   
    String name;
	int m,n,o;
	submit(int p)
	{   
	   //nt p;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter one value");
		p=sc.nextInt();
		o=p;
		System.out.println("integer value "+o);
		
	}
	submit(int i, int j)
	{  
		m=i;
		n=j;
		System.out.println("int value is "+n);
	}
    submit()
	{   
	    String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s=sc.nextLine();
		name=s;
		System.out.println(name);
	}
   
	public static void main(String args[])
	{
		submit cd=new submit(12,43);
		submit cd1=new submit(13);
		submit cd2=new submit();
	}
}