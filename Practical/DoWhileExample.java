import java.util.Scanner;

class DoWhileExample
{
	public void add(int number)
	{
		int i=10;
		do
		{
		System.out.println(number + "+" + i + "=" +(number+i));
		i--;
		}	
	while(i>0);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		DoWhileExample dw = new DoWhileExample();
		dw.add(number);
	}
}
