import java.util.*;
class rand
{
	public static void main(String args[])
	{
		String nu="1234567890";
		Random rand=new Random();
		int len=4;
		char[] otp=new char[len];
		for(int i=0;i<len;i++)
		{
			otp[i]=nu.charAt(rand.nextInt(nu.length()));
		}
		System.out.println(otp);
		System.out.flush();
		System.out.println(otp);
	}
}