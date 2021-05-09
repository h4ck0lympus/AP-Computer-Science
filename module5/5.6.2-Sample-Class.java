/*
 * Programmer: HackOlympus 
 * Date: 9th May
 * Purpose: Demonstrate ways to write methods
 */

public class Sample
{
	private String text ; 
	public Sample(String t)
	{
		text = t ; 
	}

	public boolean method1(int x, String y)
	{
		if (text.length() + y.length() <= x){
			method2(y) ; 
			return true ; 
		}
		else {
			return false ; 
		}
	}
	public void method2(String s)
	{
		text += s ; 
	}
	public static void main(String[] args)
	{
		Sample s = new Sample("dogs and cats") ; 
		boolean result = s.method1(20,"cat") ; 
		System.out.println(result) ; 
	}


}

		
