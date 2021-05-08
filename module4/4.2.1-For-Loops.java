/*
 * Programmer: HackOlympus 
 * Date: 7th May
 * Purpose: Demonstrate for loops 
 */ 

public class forloops
{ 
	private int start ; 
	private int interval ; 
	private int finish ; 
	
	public forloops(int s, int f, int i)
	{
		start = s ; 
		interval = i ; 
		finish = f  ; 
	}
	public forloops(int s, int f)
	{
		start = s ; 
		finish = f ; 
		interval = 1 ; 
	} 

	public void print()
	{
		for (int i=start; i <= finish ; i += interval){
			System.out.println(i) ;
		}
		System.out.println("Finished !") ; 
	}

	public static void main(String[] args)
	{
		forloops newLoop1 = new forloops(1,10) ; 
		newLoop1.print();

		forloops newLoop2 = new forloops(0,30,3) ; 
		newLoop2.print() ; 
	}
}
			

