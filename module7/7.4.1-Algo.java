/*
 * Programmer: HackOlympus
 * Date: 11th May 
 * Purpose: Different algorithms using 
 */ 


import java.util.ArrayList ; 

public class algo 
{
	public static Integer sum(ArrayList<Integer> list)
	{
		int sum = 0 ; 
		for (Integer i : list ){
			sum += i ; 
		}
		return sum ;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>() ; 
		list.add(1) ; 
		list.add(2) ; 
		list.add(3) ; 
		System.out.println(sum(list)) ; 
	}
}
