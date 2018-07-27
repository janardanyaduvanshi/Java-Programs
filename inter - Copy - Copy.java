interface First
{
	public abstract void m1();
}

interface Second 
{
	public abstract void m1();
}

 class Sixth implements First, Second
 {
	 public void m1()
	 {
		System.out.println("first m1 in interface fourth");
	 }
	/*  public void m2()
	 {
		System.out.println("first m2 in interface fourth");
	 } */
	 public static void main(String ar[]) 
	 {
	 Sixth s=new Sixth();
	 s.m1();
	 //s.m2();
	 }
 }
 
/* class Fourth implements Second
 {
	 public void m1()
	 {
		 System.out.println("first m1 in interface fourth");
	 }
 } 
 
 class Fifth implements First,Second
 {
	 public void m1()
	 {
		 System.out.println("first m1 in interface");
	 }
 }*/
 
/* class Third implements First
 {
	 public void m1()
	 {
		 System.out.println("first m1 in interface third");
	 }
	public static void main(String ar[])
	class Third implements First
 {
	 public void m1()
	 {
		 System.out.println("first m1 in interface");
	 }{
		Third t=new Third();
		t.m1();
		Fourth f=new Fourth();
		f.m1();
		//t.m2();
	}
 } */