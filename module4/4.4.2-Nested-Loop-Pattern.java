/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Print patters using nested loops 
 */ 

public class pattern
{ 
	public static void main(String[] main)
	{
		for (int i=0; i < 5 ; i++){ 
		// There will be 5 rows i.e loop will run 5 times
			for (int j=0; j<=i; j++){
				// loop will run till 5 rows and **5 columns**
				System.out.print("*") ; 
			}
		System.out.println() ; 
			// add new line 
		}
	}
}
	
