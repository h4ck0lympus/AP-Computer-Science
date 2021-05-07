/*
 * Programmer: HackOlympus 
 * Date: 6th May
 * Purpose: Comparing classes
 */


public class House
{
	private String color ; 
	private int size ; 
	private int bedrooms ; 

	public House(String c, int sz, int bed)
	{
		color = c ; 
		size = sz ; 
		bedrooms = bed ; 

	}

	public static void main(String[] args)
	{
		House myHouse = new House("green",1850,3) ; 
		House annasHouse = new House("Green",1850,3) ; 
		House bobsHouse ; // just initialized a null variable 
		House momsHouse = myHouse ; 

		if (myHouse == momsHouse){
			System.out.println("They are alliases of same class");
		}
		else{
			System.out.println("they are different objects");
		}

		if (myHouse != annasHouse){
			System.out.println("They are different objects and have different memmory space but may have same attributes ");
		}
		else{
			System.out.println("They are same objects");
		}

		if (bobsHouse == null) { 
			System.out.println("Has not been constructed yet");
		} 




		
	
	}
}

// though both of thm are exactly the ame they will not return True when we will compare them using "=="
// abobe 0 objects are examples of 2 different objects even though they carry same value 
// it is because they are initialized seperately
// when we will compare momsHouse with myHouse using "==" we will get True. 
// above are the examples of what we call alias classes  
