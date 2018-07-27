import java.util.Scanner;
class ab
{
	public static void main(String args[])
	{
		int a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nu");
		a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			count=a*i;
			System.out.println(a+"*"+i+"="+count);
		}
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
	}
}