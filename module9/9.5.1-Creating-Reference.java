/*
 * Programmer: HackOlympus  
 * Date: 26 May 
 * Purpose: 9.5.1-Creating-Reference In video asignment 1 
 */ 

import java.util.ArrayList ; 

public class Food
{
    private String name ; 
    public Food(String name)
    {
        this.name = name ; 
    }
    // other methods not shown 
}

public class QuickPrepFood extends Food
{
    private int preptime ; 
    public QuickPrepFood(String name, int time)
    {
        super(name) ; 
        preptime = time ; 
    }
    //other methods not shown 
}
/*
 * In a different class, declare an ArrayList that can store references to objects of both Food and QuickPrepFood. 
 * Store a reference to a Food object with the name "lasagna" and a QuickPrepFood object with the name "pizza" and a prep time 5. 
 */ 


public class ArraylistClass extends QuickPrepFood 
{
    ArrayList<Food> list = new ArrayList<Food>() ; 
    list.add(new Food("lasagna")) ; 
    list.add(new QuickPrepFood("pizza",5)) ; 
}


