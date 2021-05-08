/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Make a cow class as per given behaviour 
 */ 

public class Cow
{
	private String type ; 
	private String sound ; 
	private int milk = 0 ; 
	// default constructor 
	public Cow()
	{
		type = null ; 
		sound = null  ; 
	}
	
	// overided class
	public Cow(String t, String s)
	{
		type = t ; 
		sound = s ; 
	}

	// methods 	
	public void getSound()
	{
		System.out.println(sound); 
	}
	public void getType()
	{
		System.out.println(type); 
	}
	public void milkCow()
	{
		milk++;
	}
	public void getNumMilkings()
	{
		System.out.println(milk);
	}
}
