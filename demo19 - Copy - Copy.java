import java.util.Scanner;
class demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		int count=1;
		String[] words = s.trim().split(" ");
        System.out.println("Number of words in the string = "+words.length);
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}