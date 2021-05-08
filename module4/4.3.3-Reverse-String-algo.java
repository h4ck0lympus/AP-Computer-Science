/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Design an algorithm to reverse the string 
 */

public class reverseString
{ 
	public static void main(String[] args)
	{	
		String bold = "\033[0;1m" ; 
		String rev = "" ; 
		String word = "saippuakivikauppias" ; 

		for (int i = word.length() ; i > 0 ; i--)
		{
			String a = word.substring(i-1,i); 
			rev += a ; 
		}
		System.out.println("word = " + rev) ;
	       	if (word.equals(rev)){
			System.out.println(bold + "Palindrome detected" + bold ) ;
		}	
	}
}
