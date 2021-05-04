/*
 * Programmer: HackOlympus 
 * Date: 4 May 
 * Purpose: Make a calculator 
 */

public class calculator{
	public void Average(double n1, double n2){
		double avg =  (n1+n2)/2 ; 
		System.out.println("Average is "+ avg);
	}

	public static void main(String[] args){
		calculator avg = new calculator(); 
		avg.Average(2,3);
	}
}
