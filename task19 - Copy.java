import java.util.Scanner;
import java.lang.*;
import java.util.Random;
class Four
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int[] a=new int[10];
		for(i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		} 
		int j=0;
		while(true)
		{
		j++;
		System.out.println(j+" Numbers are :-"+Math.random()*3737);
		}
		/* 		for(i=0;i<10;i++)
		{
		
	    } */
	}
}
//1 2 3 4 5 6 7 8 9 0