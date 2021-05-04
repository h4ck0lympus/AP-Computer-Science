/*
 * Programmer: HackOlympus 
 * Date: 4 May 
 * Purpose: Demonstrate how objects are made 
 */
// class is defined
public class person{ 
	// instance variables
	private String name; 
	private int age; 
	private boolean isAdult; 
	
	// constructor of class
	// Define how should java deal with given arguments and which argument should be set to which instance variable
	public person(String nm, ing ag, boolean ad){
		name = nm;
	       	age = ag;
		isAdult = ad; 
	}
	// method 
	public void ageIncrease(){
		age += 1; 
	}

}
