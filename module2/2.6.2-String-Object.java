/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demontrate the use of + and += in String objects 
 */ 

public class StringExercise{ 
	public static void main(String[] args){
		String name1 = "HackOlympus"; 
		String name2 = "DeltaPsiFi"; 

		int age1 = 16; 
		int age2 = 17; 

		String newString1 = name1 + " " + age1; 
		String newString2 = name2; 
		newString2 += age2; 
		
		System.out.println(newString1);
		System.out.println(newString2);
	}
}
