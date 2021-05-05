/*
 * Programmer: HackOlympus
 * Date: 6th May 
 * Purpose: Demonstrate all methods(that are in AP) of math class except random
 */

import java.lang.Math ; 

public class MathMethodExceptRandom
{
	public static void main(String[] args)
	{
		int a = Math.abs(-8); 
		double b = Math.abs(-2.3); 
		System.out.println("a = " + a + "\tb = " + b) ;	

		// math.pow(base,exponent) returns base ** exponent
		double pow = Math.pow(a,b); 
		System.out.println("Math.pow(a,b) = "+pow);
	
		int num1 = 2 ; 
		int num2 = 4 ;
	       	// IMPORTANT = Math.pow always return a double value
		double result1 = Math.pow(num1,num2) ; 
		System.out.println("2ToThePower4 = " + result1);	
		
		// IMPORTANT: Math.qrt always returun a double value
		double result2 = Math.sqrt(result1) ; 
		System.out.println("result 2 = " + result2) ; 		
	}	
}
