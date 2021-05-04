/*
 * Programmer: HackOlympus
 * Data : 18 April
 * Purpose : Demonstrate compund assignment operators 
 */

public class Compound_Operators   
{
	public static void main(String[] args)
	{	
		// 1.4.1
		int x = 2 ; 
		x += 1 ; // x = x + 1  
		System.out.print("1.4.1 output = ") ;
	       	System.out.println(x) ;  // x = 3
		// 1.4.2	
		int y = 3 ; 
		x++ ; // x = 4
		y -- ; // y = 2 
		System.out.println("Output for 1.4.2") ; 
		System.out.print("x = ") ;
		System.out.println(x) ; 
		System.out.print("y = ") ;
		System.out.println(y) ; 
		
	}
}

