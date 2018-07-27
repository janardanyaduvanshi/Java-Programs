class TypeDemo
{
	int type;
  TypeDemo()
  {
	  System.out.println("Type demo first constuctor");
	  type=1;
  }
   TypeDemo(int a)
  {
	  System.out.println("Type Demo Second constuctor");
	  type=2;
  }
   TypeDemo(int a, int b)
  {
	  System.out.println("Type demo first constuctor");
	  type=3;
  }
  /* void show()
  {
	  if(type==1)
	  {
		 System.out.println("Type demo first in show constuctor"); 
	  }
	  if(type==2)
	  {
		 System.out.println("Type demo second in show constuctor");
	  }
	  if(type==3)
	  {
		 System.out.println("Type demo second in show constuctor");
	  } 
  }*/
  void real()
  {
	 if(type==1)
	  {
		 System.out.println("Type demo first in real constuctor"); 
	  }
	  if(type==2)
	  {
		 System.out.println("Type demo second in real constuctor");
	  }
	  if(type==3)
	  {
		 System.out.println("Type demo third in real constuctor");
	  }
  }
  public static void main(String args[])
  {
	  TypeDemo ty=new TypeDemo();
	 // TypeDemo ty1=new TypeDemo(10);
	//  TypeDemo ty2=new TypeDemo(20,30);
	  /* ty.show();
	  ty1.show();
	  ty2.show(); */
	  ty.real();
	  /* ty1.real();
	  ty2.real(); */
	  
  }
}