class Test
{
	public static void main(String args[])
	{
		String();//string constructor
		//String (byte[] b);
		string st1=new String(b);
        //String (charSequence seq);// String st=new String("abcd")		
		String s1="Janardan_Yadav";
		char ch[]=s1.tocharArray();
		System.out.println("string to char:-"+ch[]);
	    String s2="   Yadav  Janardan ";
		char c[]={'l','o','v','e'};
		String st=new String(c);
		System.out.println("byte to string:-"+st1);
		System.out.println("char to string:-"+st);
		System.out.println("lower case:-"+s1.tolowercase());
		System.out.println("upper case:-"+s1.uppercase());
		System.out.println("index of:-"+s1.indexOf());
		System.out.println("s1 Janardan_Yadav length:-"+s1.length());
		System.out.println("s1 Yadav Janardan trim:-"+s2.trim());
		System.out.println("s1 Yadav Janardan char at:-"+s2.charAt(2));
		System.out.println("s1 Yadav Janardan sub string:-"+s2.substring(2,9));
		System.out.println("s1 Janardan Yadav char at:-"+s2.charAt(6));
		System.out.println("char to string:-"+st.charAt(3));
		StringBuffer s3=new StringBuffer(); 
		StringBuffer s4=new StringBuffer(20);
        StringBuffer s5=new StringBuffer("Abcd"); 		
		System.out.println("String buffer capacity:-"+s3.capacity());
		System.out.println("String buffer capacity:-"+s4.capacity());
		System.out.println("String buffer capacity:-"+s5.capacity());
	}
}