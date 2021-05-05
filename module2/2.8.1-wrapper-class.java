/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Integer wrapper class 
 */ 

public class IntegerWrapper{ 
	public static void main(String[] args){
		Integer num1 = new Integer(157); // new instance of Integer datatype with value 157 
		System.out.println(num1);
		
		System.out.println(Integer.MIN_VALUE); // min value int can hold 
		System.out.println(Integer.MAX_VALUE); // max value int can hold 
		System.out.println(Integer.MAX_VALUE + 1); // prints min value as afetr max if goes back to min

		int num1int = num1.intValue(); // new instance of integer with name num1int with value same as the integral value of num1 
	}
}
