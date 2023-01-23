class VariableExample
{
	static int num = 55; 
	long num1 = 456789; 
	public void display()
	 {
		char a = 'M';
		double num2 = 45.67;
		System.out.println("local variable value : "+a);
		System.out.println("local variable value :"+num2);
	}
	public static void calc()
	{
		double b = 99.34;
		double c = 45.23;
		double res = b*c;
		System.out.println("Result is :" +res);
	}
	public static void main(String args[])
	{
		VariableExample obj = new VariableExample();
		obj.display();
		calc();
		System.out.println("Instance Variable Value : "+obj.num1);
		System.out.println("Static Variable Value : "+VariableExample.num);
		
	}
}