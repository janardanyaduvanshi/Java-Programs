import java.util.Scanner;
class rever
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter the string");
		s=sc.nextLine();
		String re="";
		for(int i=s.length()-1;i>=0;i--)
        {
			re=re+s.charAt(i);
		}
		System.out.println("String is  "+re);
	}
}