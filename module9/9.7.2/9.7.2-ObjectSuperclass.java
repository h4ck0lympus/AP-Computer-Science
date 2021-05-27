/*
 * Programmer: HackOlympus  
 * Date: 27 May 
 * Purpose: 9.7.2-ObjectSuperclass  
 */ 

class WritingUtensil    
{
    private int tipSize ; 
    public WritingUtensil(int pixels){
        tipSize = pixels ; 
    }
    // overriding toString
    public String toString(){
        return "tipSize = " + tipSize ; 
    }
}

class marker extends WritingUtensil
{
    private String tipType ; 
    public marker(int pixels, String tipType){
        super(pixels) ; 
        this.tipType = tipType ; 
    }
    
    public String toString() {
        return super.toString() + "\nTipType = " + tipType ; 
    }
}

class ObjectSuperClass_test_class
{
    public static void main(String[] args){
        WritingUtensil wu = new WritingUtensil(3) ; 
        System.out.println(wu) ; // without toString override method it will return the class name with its hashcode 
        
        // another object to test the effects of subclass on objects
        
        marker m = new marker(5,"chisel") ; 
        System.out.println(m) ; // this will print tipSize = 5 as toString is overided in WritingUtensil class 
        // to override the overriden method toString from WritingUtensil we will make another toString in marker class so that at runtime java looks at toString of marker class
        
    }
}
