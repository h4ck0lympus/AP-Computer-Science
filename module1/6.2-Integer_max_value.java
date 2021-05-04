/*
 * Programmer: HackOlympus 
 * Date: 19 April 
 * Purpose: Demonstrate Integer.MIN_VALUE and Integer.MAX_VALUE 
 */  
 



public class IntMinMax
{
	public static void main(String[] args) 
	{
		int posValue = Integer.MAX_VALUE ;
		int negValue = Integer.MIN_VALUE ; 
		System.out.println("Positive Value = "+ posValue) ;
	        System.out.println("Negative Value = "+ negValue) ; 
		System.out.println(negValue-1) ; // this will be compiled successfully as there is not syntax error 
		System.out.println(posValue+1) ; // this will print posValue instead of posValue + 1 

		
		
	}
}
