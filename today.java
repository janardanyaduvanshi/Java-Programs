import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll nu");
		int rollnu=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		System.out.println("Enter the marks of Java");
		int java=sc.nextInt();
		System.out.println("Enter the marks of C");
		int c=sc.nextInt();
		System.out.println("Enter the marks of C++");
		int cplus=sc.nextInt();
		System.out.println("Result are");
		int sum=java+c+cplus;
		double per=(sum*100)/300;
		if(per>33)
		{
			System.out.println("You are passed");
			System.out.println("You scored:-"+per+"% marks");
		}
		else
		{
			System.out.println("Sorry u Are NOt Passed");
			System.out.println("You scored:-"+per+"% marks");
		}
	}
}