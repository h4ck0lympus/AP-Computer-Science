/*
 * Programmer: HackOlympus 
 * Date: 5th May
 * Purpose: Demonstrate different string methods 
 */ 


import java.lang.* ;   

public class stringMethods{ 
	public static void main(String[] args){ 
		String word1 = "Computational" ; 
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  		
		
		System.out.println(word1.length());
		
		System.out.println(s1.compareTo(s2)); //0 because both are equal  
		System.out.println(s1.compareTo(s3)); //-5h(8) m(13) 8-13 = -5  
		System.out.println(s1.compareTo(s4)); //-1 l(12) m(13) 12-13 = -1  
		// sees the very first change
		System.out.println(s1.compareTo(s5)); //2 h(8) f(6) 8-6 = 2  
		

	}
}

