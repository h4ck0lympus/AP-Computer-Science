/*
 * Programmer: HackOlympus 
 * Date: 4th May 
 * Purpose: Create a empty constructor/default value constructor 
 */ 

public class car{ 
	private string make; 
	private boolean isSports; 
	private String owner;
	
	// this kinda constructor is created to define behaviour of instance when no arg is given
	public car(){ 
		make = null ; 
		isSports = false; 
		owner = null ;
	}
	// We can overide constructor i.e we can create more than 1 constructor as there can be numerous input pattern
	public car(String mk, boolean sports, String own){
		make = mk; 
		isSports = sports; 
		owner = own; 
	}
	// if car is for sale i.e no owner 
	public car(String mk, boolean sports){
		make = mk; 
		isSports = sports; 
	}
}

