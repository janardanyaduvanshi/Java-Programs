class Tes
{
 static int i,j;
 Tes()
 {
 //this(10,20);
 System.out.println("Default constructor");
 }
 Tes(int i, int j)
 {   
     this();
     this.i=i;
	 this.j=j;
	 System.out.println(i+" " +j);
	 
 }
 public static void main(String a[])
 {
 
    //Tes t=new Tes();
    Tes t1=new Tes(10,20);
 }
}