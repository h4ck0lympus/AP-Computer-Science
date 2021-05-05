/*
 * Programmer: HackOlympus 
 * Date: 6th May 
 * Purpose: Demonstrate the use of math class 
 */ 

import java.lang.Math ; 

public class abs
{
	public static void main(String[] args)
	{
		double a = Math.abs(-8.8); 
		Integer b = Math.abs(8);
		System.out.println(b.equals(a));
		System.out.println("a = " + a + "\nb = " + b);
	}
}	
