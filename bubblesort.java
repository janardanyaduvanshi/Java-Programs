import java.util.Scanner;
class bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		 int n=arr.length;
		 System.out.println("enter numbers");
		 for(int i=0;i<=n-1;i++)
		 {
			arr[i]=sc.nextInt(); 
		 }
		 for(int i=0;i<=n-1;i++)
		 {
			 for(int j=0;j<n-i-1;j++)
			 {
				 if(arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 System.out.println("sorted list");
		 for(int i=0;i<=n-1;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
}