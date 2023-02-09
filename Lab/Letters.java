
public class Letters
{
public static void main(String[] args) {
    int size = 5;                        //initializing variable
    int alphabet = 65;                   //initializing variable

    for (int i = 0; i < size; i++) {      //outter loop for rows
	   
      for (int j = 0; j < size - i; j++) {   //innner loop for columns
		  System.out.print(" ");
		  System.out.print((char)(alphabet+j));  //printing alphabet pattern
      }
      System.out.println();
    }
  }
}