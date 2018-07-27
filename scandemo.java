import java.util.Scanner;
class ScanDemo
{
	int x,y;
	String i;
 void Details()
 {   
     int a,b;
	 String k;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the values");
	 a=s.nextInt();
	 b=s.nextInt();
	 k=s.nextLine();
	 x=a;
	 y=b;
	 i=k;
 }
 void show()
 {
	 System.out.println("First value "+x+"  second value  "+y+"  String is  "+i);
 }
 public static void main(String[] args)
 {
	 ScanDemo d=new ScanDemo();
	 d.Details();
	 d.show();
 }
}