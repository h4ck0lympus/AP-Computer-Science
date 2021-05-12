/*
 * Programmer: HackOlympus
 * Date: 12th May 
 * Purpose: Make your first sub and super class and demonstrate constructor 
 */ 

public class Performer
{
    String name ; 
    private int age ; 

    public Performer() 
    {
        name = "Ima performer" ; 
        age = 16 ; 
        
    }
    public Performer(String name,int age)
    {
        this.name = name ; 
        this.age = age ; 
    }

}

public class Musician extends Performer
{
    private String instrument ; 
    public Musician()
    {
        instrument = "Piano" ; 
    }
    public Musician(String instrument) 
    {
        this.instrument =   instrument ; 
    }
    
}

