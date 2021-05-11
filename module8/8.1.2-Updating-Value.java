/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: Updating 2D arrays 
 */ 

public class Update
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
        int[][] arr2 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}} ;
        
        // If we want to change 5 to 50 
        Print(arr2) ; 
        arr2[1][1] = 50 ;
        System.out.println("\nNew Array\n") ; 
        Print(arr2) ; 



    }
}
