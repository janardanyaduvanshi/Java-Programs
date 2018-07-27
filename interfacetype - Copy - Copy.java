// functional  marker interface define matker is empty and point path to the functional and the functional contain the one abstract method and it convets the abstract method in byte steam.
interface a
{
	
}
interface b extends a
{
	public abstract void yes();
}
class c implements a
{
	public void yes()
	{
		System.out.println("Marker and functional interface demo\n");
	}
	public static void main(String args[])
	{
		c ce=new c();
		ce.yes();
	}
}