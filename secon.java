class second
{
  int id,password;
  String name;
  void details(int a, int b, String s)
  {
   id=a;
   password=b;
   name=s;
  }
  void show()
  {
  System.out.println("Details :--"+id+""+password+"  "+name);
  }
  public static void main(String args[])
  {
  second s=new second();
  s.details(12,32,"hi how are u");
  s.show();
  }
}