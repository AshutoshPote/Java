class UnaryExample
{
	public void  calcIncrement()
	{
		int x = 10;
		System.out.println("Increment");
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
	public void calcDecrement()
	{
		int x = 10;
		System.out.println("Decrement");
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);	
	}
	public static void main(String args[])
	{
		UnaryExample id = new UnaryExample();
		id.calcDecrement();
		id.calcIncrement();
	}
}