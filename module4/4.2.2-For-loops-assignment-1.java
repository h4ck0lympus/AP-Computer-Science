/*
 * Programmer: HackOlympus 
 * Date: 7th May 
 * Purpose: Assignment 1 based on for loops of AP class
 */ 


public class assn1
{
	public static void main(String[] args)
	{
		double p = 200 ; 
		for (int t = 0 ;  t != 50 ; t++)
		{	
			p += (0.1 * p)  ; 
			
		}
		System.out.println((int)p) ; 
	}
}	
 	
