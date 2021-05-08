/*
 * Programmer: HackOlympus 
 * Date: 8th May 
 * Pupose: To learn how to make different algorithms with strings and loops 
 */ 

public class searchSub
{	
	private String mainWord ; 
	private String subWord ; 
	
	public searchSub(String main, String sub)
	{
		mainWord = main ; 
		subWord = sub ;
	}

	public static void main(String[] main)
	{	
		
		searchSub word = new searchSub("pat","art") ; 
		for (int i = 0; i <= word.mainWord.length() - word.subWord.length() ; i ++){
			String a = word.mainWord.substring(i,i+word.subWord.length()) ; 
			if (a.equals(word.subWord)) { 
				System.out.println(true) ; 
				break ; 
			}
			else { 
				System.out.println(false);
			}
		}
	}
}


