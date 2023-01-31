import java.util.Scanner;
class Switch
{
	public void calc_grade(String grade)
	{
		switch(grade)
		{
		case "A":
		System.out.println("you are between 80-100");
		break;

		case "B":
		System.out.println("you are between 60 -79");
		break;

		case "C":
		System.out.println("your between 40-59");
		break;

		case "D":
		System.out.println("your between 35-40");
		break;

		case "F":
		System.out.println("you are fail");
		break;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter grade");
		String grade = sc.next();
		grade = grade.toUpperCase();

		Switch se =new Switch();
		se.calc_grade(grade);
	}
}


