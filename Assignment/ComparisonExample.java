class ComparisonExample
{
	public void cal()
	{
		int a=23;
		int b=32;
		System.out.println("a>b: " +(a>b));
		System.out.println("a<b: " +(a<b));
		System.out.println("a>=b: " +(a>=b));
		System.out.println("a<=b: " +(a<=b));
		System.out.println("a==b: " +(a==b));
		System.out.println("a!=b: " +(a!=b));
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a>b)&(a<b));
		System.out.println((a>b)|(a<b));
	}
	public static void main(String arg[])
	{
		ComparisonExample obj = new ComparisonExample();
		obj.cal();
	}
}




















	