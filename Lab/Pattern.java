import java.util.Scanner;

class Pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);      //creating object
		int n = sc.nextInt();                     //taking input from user
		int sp = n/2;                             //number of space
		int st = 1;                               //  number of stars
		for(int i=1;i<=n;i++){                    // outer loop
			for(int j=1;j<=sp;j++){               // inner loop for space
				System.out.print("\t");          
				}
			for(int j=1;j<=st;j++){                //inner loop for stars
				System.out.print("*\t");
				}
			if(i<=n/2){
				sp--;                              //decreament of space
				st+=2;                             // increament of stars
				}
			else{                                   //increament of space
				sp++;                               //decreament of stars
				st-=2;
			}
			System.out.println();
			}
		}
	}
				