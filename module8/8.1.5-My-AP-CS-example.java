/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: "My AP CS A Class Rocks" column wise printing example 
 */ 

public class ColumnWise
{
	public static void main(String[] args)
	{
		String[][] arr = {{"My","A"},
				  {"AP","Class"},
				  {"CS","Rocks"} } ;
		// To print : "My AP CS A Class Rocks"  
		// take each and every array, take first element from each sub-array 

		for (int i=0; i < arr[0].length ; i++){
			for (int j=0; j < arr.length; j++){
				System.out.print(arr[j][i]+" ");
			}
		
		}
		System.out.println() ; 
		
	}
}	

