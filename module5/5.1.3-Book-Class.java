/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Purpose: Designate private visibility of instance variable 
 */ 

public class Book
{
	private String title ; 
	private String genre ; 
	private String author ; 
	private int number ; 
	
	// overloaded constructor 
	public Book(String t,String g,String a,int n)
	{
		title = t ; 
		genre = g ; 
		author = a ; 
		number = n ; 
	}

	// default constructor 	
	public Book()
	{
		title = "" ; 
		genre = "" ; 
		author = "" ; 
		number  = 0 ; 
	} 
	
	public void updateTitle(String t)
	{
		title = t ; 
	}

	public void updateGenre(String g)
	{
		genre = g ; 
	}

	public void updateAuthor(String a)
	{
		author = a ; 
	}

	public void updateNumber(int n)
	{
		number = n ; 
	}


}


