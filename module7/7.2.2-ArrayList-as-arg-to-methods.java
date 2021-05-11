/*
 * Programmer: HackOlympus 
 * Date: 10 May 
 * Purpose: Demonstrate ArrayList as arguments to arguments 
 */ 

import java.util.ArrayList ; 

public class Argument
{
	public static void main(String[] args)
	{
		ArrayList<Boolean> ques = new ArrayList<Boolean>() ; 
		ques.add(true) ; 
		// Here we are calling method that does not change ArrayList Datatype
		myMethod1(ques) ; 
		myMethod2(ques) ; 
		myMethod3(ques) ; 
		System.out.println(ques.get(0)) ; 
	}
	// we are making static because we want to use it in our static main 
	// notice here we have not mentioned datatype 
	// This will not pose problem because we are just accessing but what about if we want to change the value 
	public static void myMethod1(ArrayList arr)
	{
		if (arr.size() > 0) {
			System.out.println(arr.get(0)) ;
		}
	}
	public static void myMethod2(ArrayList arr)
	{
		if (arr.size() > 0){
			arr.set(0,"Hello") ; 
		}
	}

	public static void myMethod3(ArrayList<Boolean> arr)
	{
		if (arr.size() > 0){
			arr.set(0,"Hello") ; 
		}
	}



}	
	

	

