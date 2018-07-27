class In_Main
{
	void show1()
	{
		System.out.println("In-Main first Class");
	}
}

class In_Main_Sec extends In_Main
{
	void show2()
	{
		System.out.println("In_Main_Sec class");
	}
}

class In_Main_Thi extends In_Main_Sec
{
	int a=10;
 void show3()
 {  
	 System.out.println("In_Main_Thi class");
 }
}

class In_Main_fou extends In_Main_Thi
{
	void show4()
	{
     System.out.println("In_Main_Thi class"+a);
	 System.out.println("In_Main_fou class");	
	}
}

class Mane extends In_Main_fou
{
	public static void main(String args[])
	{
	Mane m=new Mane();
	m.show1();
	m.show2();
	m.show3();
	m.show4();
	}
}