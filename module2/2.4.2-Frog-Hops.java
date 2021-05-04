/*
 * Programmer: HackOlympus 
 * Date: 5th May
 * Purpose: Demonstrate void methods with parameters using frog object 
 */ 

// Improved code based on coordinates of graph  

public class frog{
	// at first frog at origin 
	// global variables kinda thing that we have in C and python 
	int x = 0 ; 
	int y = 0 ; 
	public void forward(int hop){
		y += hop ; 
		System.out.println("The frog moved forward "+hop+" hop/s");
		System.out.println("new location = ("+ x + "," + y + ")") ; 
	}
	public void right(int hop){
		x += hop ; 
		System.out.println("The frog moved right by " + hop + " hop/s");
		System.out.println("new location = ("+ x + "," + y + ")") ;
	}
	public void left(int hop) {
		x -= hop ; 
		System.out.println("The frog moved left by " + hop + " hop/s");
		System.out.println("new location = ("+ x + "," + y + ")") ;
	}
	public void down(int hop){
		y -= hop ; 
		System.out.println("The frog moved down by "+ hop + " hop/s");
		System.out.println("new location = ("+ x + "," + y + ")") ;
	}
	// main 
	public static void main(String[] args){
		frog Frog1 = new frog(); 
		Frog1.forward(2);
	       	Frog1.right(5);
		frog Frog2 = new frog(); 
		Frog2.down(3); 
	}
}	
      	





