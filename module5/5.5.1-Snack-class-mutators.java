/*
 * Programmer: HackOlympus 
 * Date: 9th May 
 * Purpose: Demonstrate mutator methods 
 */ 

public class Pet
{
	private String name ; 
	private String typeOfPet ; 
	private int age ; 

	// constructor and methods not shown 
	
	// mutator methods 
	public void setName(String n)
	{
		name = n ; 
	}

	public void setTypeOfPet(String t) 
	{ 
		typeOfPet = t ; 
	} 
	public void setAge(int a)
	{
		age = a ; 
	}
}
