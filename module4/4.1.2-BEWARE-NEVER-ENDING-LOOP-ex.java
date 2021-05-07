/*
 * Programmer: HackOlympus 
 * Date: 7th May 
 * Purpose: Example of never ending while loop 
 */ 

public class neverEnding
{
	public static void main(String[] main)
	{ 
		int i = 10 ; 
		while (i > 0) { 
			System.out.println(i) ; 
			i++ ; // wrong statement which will cause never ending loop  
		}
	}
}

