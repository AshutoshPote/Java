import java.util.Scanner; 

class ConditionalStatement
{
        
	public void calc(int x ) 
	{               
		if((x >=35)  && (x <=49))
		{                 
 			System.out.println("you are pass"); 		
		}
     
		if((x >= 50) && (x <=59))
		{
			System.out.println("you are 2nd class"); 


		}
		if((x >= 60) && (x <= 74))
		{
			System.out.println("you are in 1st class"); 
		}
		if((x >= 75) && (x <=100))
		{
			System.out.println("you are in distinction"); 
		}
 		else if(x<=34)
		{
                
 			System.out.println("you are fail"); 		
		}

	}
        
	public static void main(String args[])
	{
			
		Scanner s = new Scanner(System.in);			
		System.out.println("Enter number 1");
			
		int x = s.nextInt();
			
		ConditionalStatement obj = new ConditionalStatement(); 
              
		obj.calc(x); 
	 
}

}







