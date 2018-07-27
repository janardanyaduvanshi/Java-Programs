class try_demo
{ 
        void rev()
        {
			try
            {
		    String s="hi not a new";
			String r="";
			System.out.println(s);
			for(int i=s.length();i>0;i--)
			{
				r=r+s.charAt(i);
		    }
			System.out.println(r);
			System.out.println("reverses");
		    }
      catch(StringIndexOutOfBoundsException ex)
	  {
		  ex.printStackTrace();
		  System.out.println("rev method catch executed");
	  }
	  }	  
	public static void main(String args[])
	{
		try_demo td=new try_demo();
		td.rev();
		try
		{
		  System.out.println("in start of the try block");
		  int a=10;
          int b=0;
          System.out.println(a/b);		
          System.out.println("in the try block");	
          // void add()
		  // {
			  // int a=10;
			  // int b=10;
			  // System.out.println(a+b);
		  // }
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("in catch block");
		}
		finally
		{
			System.out.println("in the finally");
		}
	}
}