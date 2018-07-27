import java.util.Scanner;
class thrw
{   
    Static String passs;
	static void enter()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		Static String pass=sc.nextLine();
		this.passs=passs;
	}
	static void pass()//String s)
	{
     if(passs!="sss")
	 {
		 System.out.println("Enter corrrect password");
	 }
	 else
	 {
		 System.out.println("welcome bhai");
	 }
	}
	public static void main(String args[])
	{
		thrw.enter();
		thrw.pass();
	}
}