class ArithmeticExample
{
	public void cal()
	{
		int a=8;
		int b=4;
		System.out.println("Addition: " +(a+b));
		System.out.println("Subtraction" +(a-b));
		System.out.println("Multiplication: " +(a*b));
		System.out.println("Division: " +(a/b));
		System.out.println("Modules: " +(a%b));
	}
	public static void main(String args[])
	{
		ArithmeticExample obj = new ArithmeticExample();
		obj.cal();
	}
}
