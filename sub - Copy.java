import java.math.*;
class submit
{
 int one,two,ans;
 
 //addition
 
 int add(int a, int b)
 {
  one=a;
  two=b;
  ans=a+b;
  return(ans);
 }
 
 //subtraction
 
 int sub(int a, int b)
 {
  one=a;
  two=b;
  ans=a-b;
  return(ans);
 }
 
 //multiplication
 
 int multiplication(int a, int b)
 {
  one=a;
  two=b;
  ans=a*b;
  return(ans);
 }
 
 //division
 
 int division(int a, int b)
 {
  one=a;
  two=b;
  if(b<a)
  {
  ans=a/b;
  }
  else
  {
  System.out.println("in-correct values");
  }
  return(ans);
 }
 
 // modulas
 
  int modulas(int a, int b)
 {
  one=a;
  two=b;
  if(b<a)
  {
  ans=a%b;
  }
  else
  {
  System.out.println("in-correct values");
  }
  return(ans);
 }
 
 // area of rectangle
 
 int rec(int l, int b)
 {
  one=l;
  two=b;
  ans=l*b;
  return(ans);
 }
 
 // area of circle
 
 
 int circle(int r)
 {
  one=r;
  ans=(int) (3.14*(r*r));
  return(ans);
 }
 
 // percentage calculation
 
  int percentage(int a, int b)
 {
  one=a;
  two=b;
  ans=(one*(two/100));
  return(ans);
 }
 // display method
 
 void show()
 {
  System.out.println(ans);
 }
 
  // main method
  
  public static void main(String[] args)
  {
   submit s=new submit();
   s.add(5,5);
   s.show();
   s.sub(30,10);
   s.show();
   s.multiplication(5,6);
   s.show();
   s.division(100,10);
   s.show();
   s.modulas(102,10);
   s.show();
   s.rec(2,2);
   s.show();
   s.circle(2);
   s.show();   
   s.percentage(500,5);
   s.show();
  }
}