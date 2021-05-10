/*
 * Programmer: HackOlympus
 * Date: 10th May 
 * Purpose: Demonstrate right shift algorithm 
 */ 


 public class rightShift
 {
     public static void main(String[] args) {
         int [] numbers = {1,2,3,4,5} ; 
         int [] shifted = new int[numbers.length] ; 

         int shift = 8 ; 
         // we will use algorithm like what we use in rot-13 cipher 
         for (int i = 0 ; i < numbers.length ; i++){
             shifted[(i + shift) % numbers.length] = numbers[index] ; 
         }
         numbers = shifted ; 
         for (int num: numbers){
             System.out.print(num + " ") ; 
         }
         System.out.println() ; 
     }
 }


