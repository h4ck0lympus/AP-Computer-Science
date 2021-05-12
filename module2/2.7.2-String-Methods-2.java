/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demonstrate the use of substring method of strings 
 */ 

import java.lang.* ; 

public class substring{
	public static void main(String[] args){
		String word = "computational"; 
		String a = word.substring(0,5); 
		// overided substring (it has different constructors) 
		
		String b = word.substring(5) ; 
		System.out.println("a = "+a); 
		System.out.println("b = "+b);
		String c = a; 
	       	c += b ; 	
		System.out.println("a+b = "+ c); 
		
	
	}
}
