/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Make a cow class as per given behaviour 
 */ 

public class Cow
{
	private String type ; 
	private String sound ; 
	private int milk ; 
	// default constructor 
	public Cow()
	{
		type = null ; 
		sound = null  ; 
		milk = 0 ; 
	}
	
	// overided class
	public Cow(String t, String s)
	{
		type = t ; 
		sound = s ;
	       	milk = 0 ; 	
	}

	// accessor method for sound instance variable	
	public void getSound()
	{
		System.out.println(sound); 
	}
	// accessor method for type instance variable
	public void getType()
	{
		System.out.println(type); 
	}
	// accessor method for milk instance variable
	public void getNumMilkings()
	{
		System.out.println(milk);
	}
	// mutator methods 
	public void milkCow()
	{
		milk++;
	}
}
