/*
 * Programmer: HackOlympus
 * Date: 9th May 
 * Purpose: 
 */

public class Sports
{
	private String name ; 
	private int numAthletes ;
       	
	public Sports(String n, int num)
	{
		name = n ; 
		numAthletes = num ; 
	}
	public String toString()
	{
		return "Name:" + name + "\nNumber of athletes: " + numAthletes ; 
	}

	public String getName()
	{
		return name ; 
	}
	
	public int getNumAthletes()
	{
		return numAthletes ; 
	} 
	public static void main(String[] args)
	{
		Sports volley = new Sports("volleyball",12) ;
		// lets try to print the value of volley variable 
		//System.out.println(volley) ; 
		// we get : Sports@51c8530f
		
		// after toString is made

		System.out.println(volley) ; 
	} 

}	


