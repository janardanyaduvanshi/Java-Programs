//custom exception  
class Task
{
	public static void main(String args[])
	{
		String[] s=new String[3];
		s[0]="new";
		s[1]=null;
		s[2]="old";
		for(String ss:s)
		{
			System.out.println("values are"+ss);
		}
	}
}