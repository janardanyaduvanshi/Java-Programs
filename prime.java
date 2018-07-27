import java.util.Scanner;
class a
{
	public static void main(String args[])
	{
		int a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nu");
		a=sc.nextInt();
		for(int i=2;i<=100;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("yes it prime");
		}
		else
		{
			System.out.println("no its not prime");
		}
	}
}