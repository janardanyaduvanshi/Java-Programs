// string method chaining aeiou
import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
	 int count=0,i;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String sen=sc.nextLine();
	 for(i=0;i<=sen.length()-1;i++)
	 {
		 if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u')
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
 } 
}

//|| sen.charAt[i]=='e'|| sen.charAt[i]=='i'|| sen.charAt[i]=='o'|| sen.charAt[i]=='u'