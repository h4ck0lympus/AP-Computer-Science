/*
 * Programmer: HackOlympus
 * Date: 10th May 
 * Purpose: FRQ 1 solution
 */ 

public class ArrayManipulator
{
	private int [] list ; 

	public ArrayManipulator(int numElements) 
	{
		list = new int[numElements] ; 
	}

	// 1 2 3 4  
	public int getMiddleIndex()
	{
		if (list.length % 2 == 0 ) {
			return ((list.length / 2) - 1) ; 

		}
		return (list.length / 2) ; 
	}

	public double getAvg()
	{
		// avg of first middle and last element
		return ((list[0] + list[getMiddleIndex()] + list[list.length -1 ]) / 3.0) ; 
	}
		
}



