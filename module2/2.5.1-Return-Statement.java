/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demonstrate the use of return statements
 */ 

public class calc{ 
	public double avgof2(double n1,double n2){
		double avg = (n1+n2)/2 ; 
		return avg; 
	}
	public double avgof3(double n1,double n2, double n3 ){
		double avg = (n1+n2+n3)/3 ; 
		return avg; 
	}
	public static void main(String[] args){
		calc calculator = new calc();
		System.out.println("The avg of 2 nums 5 and 6 is "+calculator.avgof2(5,6));
		System.out.println("The avg of 3 nums 5,6 and 7 is "+calculator.avgof3(5,6,7));
	}
}
		
