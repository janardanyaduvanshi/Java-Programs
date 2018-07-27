import java.util.Scanner;
class rev
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println("remove vowel");
		int count=0;
		int val=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
				//val=val+1;
			}
		}
		System.out.println("vowels are  "+count+"  ");
		String s="janardan";
		//System.out.println()
	}
}