/*
 * Programmer: HackOlympus 
 * Date: 11th May 
 * Purpose: Display contents of ArrayList 
 */ 


import java.util.ArrayList ; 
public class display
{	
	public static String display(ArrayList<String> list)
	{
		String s = "" ; 
		for (int i = 0; i<list.size() ; i++){
			if (i == list.size() -1 ) s+= list.get(i) ;   
			else s += list.get(i) + "_" ;
		}	
		return s ; 
		
	}
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>(3) ;  
		list.add("a") ; 
		list.add("b") ; 
		list.add("c") ; 	
		list.add("d") ; 
		list.add("e") ; 
		System.out.println(display(list)) ;
	}
}	
