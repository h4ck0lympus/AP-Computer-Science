/*
 * Programmer: HackOlympus 
 * Date: 5th May 
 * Purpose: Demonstrate the use of else-if statements using gradeEvaluator 
 */

// improved


public class gradeEvaluator
{
	private String name ; 
	private Double marks ;
	public gradeEvaluator(String nm, Double mk)
	{
		name = nm ; 
		marks = mk ; 
	}	
	public String whatGrade()
	{	
			
		if  (marks > 90 && marks <= 100){
			//System.out.println("A") ; 
			return "A" ; 
		}
		else if (marks <= 90 && marks > 80){
			//System.out.println("B") ;
			return "B" ;  
		}
		else if (marks <= 80 && marks > 70) { 
			//System.out.println("C") ;
			return "C" ;  
		}
		else {
			//System.out.println("D") ; 
			return "D" ; 
		}
	}

	public static void main(String[] args)
	{
		gradeEvaluator grade1 = new gradeEvaluator("HackOlmpus",87.0); 

		System.out.println("name = "+grade1.name + "\nmarks = "+ grade1.marks + "\ngrade = " + grade1.whatGrade()) ; 
	}
}
		
					

