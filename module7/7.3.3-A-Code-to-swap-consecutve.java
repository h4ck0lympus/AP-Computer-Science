/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: Swap consecutive elements 
 */ 

public class swap
{
	public static void swapConsecutive(ArrayList<Double> myList) 
	{
		for (int i=0; i<myList.size()-1; i+=2) 
		{
			double temp = myList.get(i) ; 
			myList.set(i,myList.get(i+1)) ; 
			myList.set(i+1,temp) ; 
		}
	}
}
