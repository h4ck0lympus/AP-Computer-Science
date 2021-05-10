import javax.print.event.PrintEvent;

/*
 * Programmer: HackOlympus 
 * Date: 10th May 
 * Purpose: Introduction to arrays 
 */
public class arrays
{
	public static void main(String[] args)
	{
		// create an integer array of size 5 
		
		int [] list1 = new int[5] ;
	    list1[2] = 33 ; 
		list1[3] = list1[2] * 3 ; 	

		// lets try to print the array
		System.out.println(list1);
		// we get this: [I@13eb8acf and this is hash code of that array  
		// to print value of the element at index 2 we will do : 
		System.out.println(list1[2]);
		// and we get 33  
	
	}
}
