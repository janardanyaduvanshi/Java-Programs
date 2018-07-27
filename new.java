class p
{
	public static void main(String args[])
	{
		boolean[] c=new boolean[2];
		for(boolean bb:c)
		{
			System.out.println(bb);
		}
		String[] s=new String[2];
		s[1]="apple";
		for(String ss:s)
		{
			System.out.println(ss);
		}
		int[] i=new int[2];
		i[1]=89;
		for(int ii:i)
		{
			System.out.println(ii);
		}
		float[] f=new float[2];
		f[1]=32;
		for(float ff:f)
		{
			System.out.println(ff);
		}
		double[] d=new double[2];
		for(double dd:d)
		{
			System.out.println(dd);
		}
	}
}