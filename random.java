import java.util.*;
class rand
{	
static char[] OTP(int len)
{
	System.out.println("generate otp using rand()");
	System.out.println("Your otp");
	String numbers="0123456789";
	Random mem_method=new Random();
	char[] otp=new char[len];
	for(int i=0;i<len;i++)
	{
		otp[i]=numbers.charAt(mem_method.nextInt(numbers.length()));
	}
	return otp;
}

public static void main(String args[])
{
	int len=4;
	System.out.println(OTP(len));
}
}