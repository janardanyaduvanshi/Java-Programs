package com.pac;
import java.util.Scanner;
public class Pack_Demo2
{
  int a;
  long b;
  double e;
  float f;
  char g;
  public void show(int c, double d, float i,char j,long k)
  {
     Scanner sc=new Scanner(System.in); 
	 System.out.println("Enter the numbers");
	 c=sc.nextInt();
	 d=sc.nextDouble();
	 i=sc.nextFloat();
	 //j=sc.nextChar();
	 a=c;
	 e=d;
	 f=i;
	 //g=j;
	 b=k;
    System.out.println("integer value is "+a+"double value is "+b+"float value is "+f+"char is "+g+"long value is "+k);
  }
}