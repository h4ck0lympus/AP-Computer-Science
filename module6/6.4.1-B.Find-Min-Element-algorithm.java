/*
 * Programmer: HackOlympus 
 * Date: 10th May
 * Purpose: Make an algorithm to find the min element of an array
 */

public class Min
{
	private double[] arr ;  
	
	public Min(double[] arr)
	{
		this.arr = arr ; 
	}

	public double findMin()
	{
		double min = arr[0] ; 

		for (double i: arr){
			if (i < min){
				min = i ; 
			}
		}
		return min ; 
	}
	public static void main(String[] args)
	{	double[] a = {4,2,6,0,5} ; 
		Min list = new Min(a) ; 
		System.out.println(list.findMin()) ; 
	}
}

