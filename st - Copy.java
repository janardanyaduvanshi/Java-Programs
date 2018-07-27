class St
{
  static int a=10;
 static 
 {
 System.out.println("Static class");
 }
 // instance example
 {
 System.out.println("Instance class");
 }
 public static void main(String args[])
 {
   St s=new St();
   s.a=0;
   System.out.println(a);
 }
}