interface abc
{
	public abstract void demo();
}
  
interface bc
{
	public abstract void demo2();
}  
class c implements abc,bc
{
 public void demo()
 {
	 System.out.println("Hi its interface abc demo"); 
 } 
 public void demo2()
 {
	 System.out.println("Hi its interface abc demo2"); 
 }
 public static void main(String args[])
 {
	 c cd=new c();
	 cd.demo();
	 cd.demo2();
 }
}
	
	// initlization of object
	/* static 
	{
		System.out.println("Hi its satatic");
	}
	{
		System.out.println("Hi its instance");
	}
	public static void main(String[] args)
	{
		abc a=new abc();
	} 
	
	contructor over loading with this 
	
	 abc()
 {
	 this(10);
	System.out.println("abc constructor"); 
 }
 abc(int i)
 {
	 this("hi",1289.3278);
	System.out.println("abc para metrized constructor"+i); 
 }
 abc(String ab, double d)
 {
	System.out.println("abc two parametrized constructor"+ab+"  "+d); 
 }
 public static void main(String args[])
 {
	 abc a=new abc();
	 //abc a1=new abc(10);
	 //abc a2=new abc("hi",43.23);
 }
 
 
 method overriding with co varient 
 
 class abc
{
  abc demo()
  {
	  System.out.println("Hi in demo method of class abc");
      //return this;
	  return demo();
  }
}

class def extends abc
{
  abc demo()
  {
	  System.out.println("Hi in demo method of class def");
      //return this;
	  return new def();
  }
  public static void main(String args[])
  {
	  def d=new def();
	  d.demo();
  }
}

this with method overloading


	void copy()
	{
	 this.copy(10);  //non static varible this can not refrence to static vaiable if in main
	 System.out.println("first method");	
	}
	void copy(int a)
	{
	this.copy("hi");
	 System.out.println("second method"+a);	
	}
	void copy(String s)
	{
	 System.out.println("third method"+s);	
	}
	public static void main(String args[])
	{
		abc b=new abc();
		b.copy();
	}
	*/