/*
 * Programmer: HackOlympus 
 * Date: 9th May 
 * Purpose: answer for in class FRQ -1 
 */

public class Assignment
{	

	// nextClasswordID and nextHomewordID is static so that it does not depend upon object they remain same for all objects, as they now belong to class 
	private static int nextClasswordID = 1 ; 
	private static int nextHomeworkID = 1 ; 
	private String name ; 
	private int pointValue ; 

	// methods not shown 
	// what i wrote: 
	
	/*	
	 public Assignment(String type, int pv, String n)
	{
		if (type == "classword"){
		name = n ;   
		pointValue = pv ; // pointvalue  
		nextClasswordID += 1 ; 
		}
		else if (type == "homework"){
			name = n ; 
			pointValue = pv ; 
			nextHomeworkID += 1 ; 
		}
	}
	*/ 
	
	// correct method 
	
	public Assignment(String type, int pv)
	{
		if (type.equals("classwork")){
			pointValue = pv ; 
			nextClasswordID++ ; 
			name = type + " " + pv ; 
		}
		else if (type.equals("homework")){
			pointValue = pv ; 
			nextHomeworkID++ ; 
			name = type + " " + pv ; 
		}
	}
	// other methods not shown 
}	


		
