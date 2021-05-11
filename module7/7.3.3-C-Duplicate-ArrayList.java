/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: Duplicate ArrayList
 */ 

import java.util.ArrayList ; 

public class duplicate
{
	public static ArrayList<Integer> duplicate(ArrayList<Integer> mylist, int n)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>(); 
		for (int i = 0 ; i<n; i++)
		{
			for (Integer value : mylist)
			{
				temp.add(value) ; 
			}
		}
		return temp ; 
	}

	public static void display(ArrayList<Integer> list)
	{
		for (int i = 0; i<list.size() ; i++){
			System.out.print(list.get(i)+" ") ;
	
		}
		System.out.println() ; 

	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>() ;  
		list.add(1) ; 
		list.add(2) ; 
		list.add(3) ; 	
		list.add(4) ; 
		list.add(5) ;  
		display(duplicate(list,2)) ;
	}
}
