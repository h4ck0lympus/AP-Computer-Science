/*
 * Programmer: HackOlympus
 * Date: 5th May
 * Purpose: Demontrate the nested if-else statements
 */ 

public class ifelseStatements
{
	public static void main(String[] args)
	{
		int a = 20 ; 
		
		// always use brackets 
		// if statements does not require brackets so we can do this but this pose problem of dangling else
		if (a>30)
			if (a<60)
				System.out.println("a is greater than but less than 60") ; 
		else
			System.out.println("Which if statement do i belong to ? ") 
		// above else belong to nearest if statement
		// to overide this and use it for not the nearest if we use curly brackets
	}
}
