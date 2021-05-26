/*
 * Programmer: HackOlympus 
 * Date: 12th May 
 * Purpose: Overiding methods sub/super classes 
 */

import java.utli.ArrayList ; 

public class performer
{
    private String name ; 
    private int age ; 
    public performer(String name, int age)
    {
        this.name = name ; 
        this.age = age ; 
    }
    public getName()
    {
        return name ; 
    }
    public void practice()
    {
        System.out.println("Honing my craft!") ; 
    }
    public void perform()
    {
        System.out.println("Performing for an audience!") ; 
    }
}

public class Comedian extends performer
{
    private ArrayList<String> jokes ;

    public Comedian(String name,ing age) {...}
    // other constructors not shown

    public void writeJoke() {...}
    //adds joke in ArrayList
}



