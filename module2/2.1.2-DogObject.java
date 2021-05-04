/*
 * Programmer: HackOlympus 
 * Date: 4th May 
 * Purpose: Define a Dog object
 */ 


public class dog{
	// instance variables
	private String name; 
	private String breed; 
	private int age; 
	
	// constructor 
	public dog(String nm, String bd, int ag){
		name = nm; 
		breed = bd; 
		age = ag; 
	}
	// bark method 
	public void bark(){ 
		System.out.println("woof!");
	}
	public static void main(String[] args){
		dog gracedog = new dog("grace","lab",1);
		gracedog.bark();
	}
}

