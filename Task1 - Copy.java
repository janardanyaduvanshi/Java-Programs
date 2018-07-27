import java.util.Scanner;
class Task
{
	public static void main(String args[])
	{
		while(true)
		{
		String s;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		for(i=0;i<s.length()-1;i++)
		{
		  if(s.charAt(i)==s.charAt(i+1))
		  {
              System.out.println(s.charAt(i));
		  }	
		  
		}
		}
            
	}
}
       /*  StringBuffer sb=new StringBuffer(s);
		String result=sb.toString();		  
        System.out.println(result);
			  sb.deleteCharAt(i);	 */