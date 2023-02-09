

class SumEO {

    public static void main(String[] args) {


        System.out.print("List of Even and Odd numbers and Sum of natural numbers \n");
		int num = 200;                                         //initializing variable
		int sum=0;                                             //initializing variable
		
		System.out.println("The following number's are even:");
		for (int i=1; i<=num; i++)                             //applying "for loop" for even number
		{
			sum = sum+i;
			 
			if(i % 2 == 0)                                     //setting conditions
			{
				System.out.print(i+" ");                       //even number will be printed if given condition is true
			}
		}
		
		System.out.println("\nThe following number's are odd: ");
		for (int i=1; i<=num; i++)                              //applying another "for loop" for odd number 
		{ 
			if (i%2!=0)                                         //setting cnditions
			{
				System.out.print(i+" ");                         //odd number will be printed if given condition is true
			}	 
			
			
		}
		System.out.println("\nSum of First 100 Natural Numbers is = " + sum); 

        
    }
}

