/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demontstrate Different ways to create string
 */ 

public class string{ 
	
	public static void main(String[] args){
		// method 1 
		String name = "String Using method 1"; 
		System.out.println(name);
		//method 2 
		String name2 = new String("String using method 2");
		System.out.println(name2) ; 
		// method 3 
		String name3 = "This is Method 3\nBye!"; 
		String name4 = new String(name3);
		System.out.println(name4);
	}
}
