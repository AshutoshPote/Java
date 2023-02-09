import java.util.Scanner;

class Calculator
{
		public void calc(int a, int b, int operator){
		int result;
		

		switch(operator)
			{
			case 1:
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
			break;
		
			case 2 :
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
			break;

			case 3 :
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
			break;

			case 4 :
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
			break;

			default :
			System.out.println("invalid oparetor");
			break;
			}
		}
	public static void main(String[] args)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" choose case");
			int input = sc.nextInt();
			System.out.println("enter value of a");
			int a = sc.nextInt();
			System.out.println("enter value of b");
			int b = sc.nextInt();
			
			Calculator ca = new Calculator();
			ca.calc(a,b,input);
			
			
		}
}

