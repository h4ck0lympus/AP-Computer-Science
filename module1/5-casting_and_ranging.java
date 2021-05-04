/*
 * Programmer: HackOlympus
 * Date: 18 April
 * Purpose: Demonstrate roundignw ith casting 
 */

public class RoundingPositiveNumbers
{
	public static void main(String[] args)
	{
		long starttime = System.currentTimeMillis();
		double number = 11.0/4 ;
		long a = 2 ; 
		System.out.println("Long number = "+a) ; 
		System.out.println(number) ; 
		int roundedNumber = (int) (number + 0.5) ; 
		System.out.println(roundedNumber) ;
		System.out.println("11.0 / 4 = " + number ) ;
	        System.out.println("11/4 = " + (int)number ) ; 	
		System.out.println("11.0 / 4 rounded = " + roundedNumber) ; 
		System.out.println("rounded -11.0 / 4 = " + (int)(-11.0/4) ) ; 	
		long endtime = System.currentTimeMillis(); 
		System.out.println("That took " + (endtime - starttime) + " milliseconds");
	}
}	

