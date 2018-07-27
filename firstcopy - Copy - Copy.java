class Test{
	int rollnu,marks;
	void data(int r,int m){
		rollnu=r;
		marks=m;
	}
	void display()
	{
		System.out.println("Details"+rollnu+"  "+marks);
	}
	public static void main(String... a)
	{
		Test t=new Test();
		t.data(10,20);
		t.display();
	}
}

//var arg method and error is var arrient