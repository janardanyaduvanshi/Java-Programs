import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] save=new int[10];
		System.out.println("Enter the nu");
		int a=sc.nextInt();
		int mod,i=0;//save=0;
		while(a!=0)
		//for(i=0;i<save.length;i++)
		{
			save[i]=save[i]*10;
			save[i]=a%10;
			a=a/10;
			//save=mod;
			System.out.print(save[i]);
		}
		i++;
	}
}

//while 123/10=12
// 123%10=3       3
// 12/10=1 
//12%10=2         2