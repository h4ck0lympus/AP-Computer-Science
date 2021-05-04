/*
 * Programmer: HackOlympus 
 * Date: 19 April 2021
 * Purpose: Demonstrate integer range 
 */

public class overflow_error
{
	public static void main(String[] args)
	{
		int posInt = 21474836470 ; // this will give us an error because it exceeds int +ve limit
		int negInt = -21474836480 ; 
		System.out.println("posint = "+ posInt) ; 
		System.out.println("negint = "+ negInt) ; 
	}
}

