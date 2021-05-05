/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demonstrate different String methods 
 */ 

// we will import a new package where string class is stored. 
import java.lang.String; // semicolon required

// we can also do 

import java.lang.*; 


public class StringMethods{
	public static void main(String[] args){
		//String word = "computational" ; 
		String word = new String("computational");
		System.out.println(word.indexOf("n")); // prints 10 
		System.out.println(word.indexOf("a")); 
		System.out.println(word.indexOf("c"));
	      	// This will print the index of very first 't' that java interpreter sees i.e 5  	
		System.out.println(word.indexOf("t")); 
	}
}
