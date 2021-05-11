/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: Print2DArray
 */ 


public class Read2DArray
{
	public static void Print(int [][] arr2)
	{
		for (int i=0; i<arr2.length ; i++){
			System.out.println("Taking array/row " + i) ; 
			for (int j=0 ; j<arr2[0].length; j++){
				System.out.print(arr2[i][j]+" "); 
			}
			System.out.println() ; 
		}
	}

	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}} ; 
		int[][] arr2 = new int[3][3] ; 
		Print(arr) ; 
	}
}


