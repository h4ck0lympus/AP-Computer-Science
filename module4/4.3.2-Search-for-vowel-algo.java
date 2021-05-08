/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Search for vowel in string 
 */

public class searchVowels
{
	public static void main(String[] args)
	{
		String word = "queueing" ; 
		// QUEUEING Euouae
		int counter = 0 ; 
		for (int i = 0 ; i <= word.length() - 1; i++) { 
		       String a = word.substring(i,i+1) ; 

		       if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) { 
			       counter++ ; 
			}
		}
		System.out.println("vowels in " + word + " = " + counter) ; 
	}
}
