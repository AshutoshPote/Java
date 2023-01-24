class TernaryExample
{
	public void cal()
	{
		int a=3;
		int b=6;
		int c=(a<b) ? a:b ;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		TernaryExample obj = new TernaryExample();
		obj.cal();
	}
}
		