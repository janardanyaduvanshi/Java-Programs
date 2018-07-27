class Hier
{
	void show()
	{
		System.out.println("Super class");
	}
}

class Hier_Fir extends Hier
{
	void show1()
	{
		System.out.println("first child class");
	}
}

class Hier_Sec extends Hier
{
	void show1()
	{
		System.out.println("Second child class");
	}
	
}

class Child extends Hier
{
  public static void main(String args[])
	{
	 Hier_Sec hs=new Hier_Sec();
     hs.show1();	
     Hier_Fir hf=new Hier_Fir();
     hf.show1();	 
	}	
}