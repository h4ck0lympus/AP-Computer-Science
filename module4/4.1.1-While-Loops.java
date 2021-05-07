/*
 * Programmer: HackOlympus 
 * Date: 7th may 
 * Purpose: Introduce while loops
 */

// improved

public class PrintWhileLoop
{	
	private int value ; 
	private int finish ; 

	public PrintWhileLoop(int v, int f)
	{
		value = v ; 
		finish = f ; 
	} 

	public void print()
	{	
		int i = value ; 
		while (i <= finish){
			System.out.println(i);
			i++ ; 
		}
		System.out.println("Finished !");
	}

	public static void main(String[] args)
	{
		PrintWhileLoop newLoop = new PrintWhileLoop(1,5);

		newLoop.print() ; 
	}
}
