/*
 * Programmer: HackOlympus
 * Date: 10th May 
 * Purpose: Demonstrate find max algorithm
 */ 


public class max
{
    public static void main(String[] args)
    {
        double[] list = {1,2,3,4,5} ; 
        double max = list[0] ;
        
        for (double i: list){
            if (i>max){
                max = i ;  
            }

        }
        System.out.println(max); 
    }
}


