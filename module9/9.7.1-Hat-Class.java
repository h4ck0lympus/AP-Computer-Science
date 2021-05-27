/*
 * Programmer: HackOlympus  
 * Date: 27 May 
 * Purpose: 9.7.1-Hat-Class  
 */ 

public class Hat    
{
    private int size ; 
    private String material  ; 
    public Hat(int size,String material){
        this.size = size ; 
        this.material = material ; 
    }
    public String toString(){
        return "Size = " + size + "\nMaterial = " + material  ; 
    }
    public static void main(String[] args){
        Hat h = new Hat(54,"wool") ; 
        System.out.println(h) ; 
    }
}



