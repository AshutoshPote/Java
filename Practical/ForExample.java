import java.util.Scanner;

class ForExample
{
	public void table(int number)
	{
	for (int i = 1; i < 100; i++)
	{
		System.out.println(number +"x" + i +"=" + number*i);
	}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		ForExample fe = new ForExample();
		fe.table(number);
	}
}	