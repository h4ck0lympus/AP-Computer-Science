/*
 * Programmer: HackOlympus 
 * Date: 5th May
 * Purpose: Demonstrate different type of wrapper classes 
 */

import java.lang.* ; 

public class wrapperDouble
{
	public static void main(String[] args)
	{
		Double score1 = new Double(89.45); // create new object
		System.out.println("score1 is " + score1);
		Double score2 = new Double(92.38);
		System.out.println("score2 is " + score2);
		Double score3 = new Double(101.0); 
		// below is same as new Double() statement
		// Double meanScore = (score1 + score2 + score3) / 3 ;
		Double meanScore = new Double((score1+score2+score3)/3) ;
		System.out.println("Double meanScore = " + meanScore);
		Double newDoubleVar1 = new Double(19.2);
		System.out.println(newDoubleVar1);


		double mean2 = meanScore.doubleValue(); // double method
		System.out.println("double mean2 = " + mean2); 
	}
}
