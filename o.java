import java.util.*;
class re
{
	public static void main(String[]args)
	{
		while(true)
		{
		String s="1234567890";
		Random r=new Random();
		int len=4;
		int c=1;
		char[] otp=new char[len];
		for(int i=0;i<len;i++)
		{
			otp[i]=s.charAt(r.nextInt(s.length()));
		}
		System.out.println(otp+"  "+c);
		c++;
		}
	}
}