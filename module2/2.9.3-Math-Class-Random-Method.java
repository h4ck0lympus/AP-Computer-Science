/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demonstrate the use of random method of math class
 */

import java.lang.Math ; 

public class RandomMethod
{
	public static void main(String[] args)
	{
		Double a = Math.random() ; 
		System.out.println(a) ;
		System.out.println(a*10) ; 	
	       	// now the number will be trucated
		// this is how we can get a integer number between 0 - 10 (exclusive)
		System.out.println((int)(a * 10)) ;
	        // this is how we can get a integer number between 0 - 10 (inclusive)	
		System.out.println((int)(a * 10 + 1)) ;
			
	
	
	}
}	

