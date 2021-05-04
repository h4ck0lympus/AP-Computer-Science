/*
 * Programmer: HackOlympus 
 * Date: 4th May 
 * Purpose: Demonstrate the use of overide using different constructors 
 */

public class employee{ 
	private String name; 
	private String EmployeeID;
	private int payrate; 

	public employee(String nm,String id, int pay){
		name = nm; 
		EmployeeID = id;
		payrate = pay; 
	}
	public employee(String nm, String id){
		name = nm;
		EmployeeID = id; 
		payrate = 20; 
	}
}
		
