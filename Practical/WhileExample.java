import java.util.Scanner;

class WhileExample
{
	public void table(int number)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(number + "x" + i + "=" + number*i);
			i++;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
		WhileExample we = new WhileExample();
		we.table(number);
	}
}