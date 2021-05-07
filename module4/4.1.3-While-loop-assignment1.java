/*
 * Programmer: HackOlympus 
 * Date: 7th May 
 * Purpose: Assignment-1 of class assignments  
 */

public class assignment
{
	public static void main(String[] args)
	{
		double principal = 200 ;  
		int time = 0 ; 
		while (principal <= 1000){
			double a = 0.1 * principal ;
		       	principal += a ; 
			System.out.println("principal = "+principal) ;
			time++ ;
		
		}
		
		System.out.println("time = " +  time);	
	}
}
			
