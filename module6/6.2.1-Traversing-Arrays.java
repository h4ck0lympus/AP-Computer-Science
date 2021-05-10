/*
 * Programmer: HackOlympus
 * Date: 10th May 
 * Purpose: Demonstrate traversing arrays
 */ 



import java.lang.Math ; 

public class traversing
{
    public static void main(String[] args) {
        int[] list1 = new int[5] ; 
        int[] list2 = new int[5] ; 
        
        for (int i = 0 ; i < list1.length ; i+=1) {
            list1[i] = (int) (Math.random() * 10) ; 
            System.out.println("Element at index " + i + " = " + list1[i]);
        }
        System.out.println("\nNew array starts\n");
        for (int i = 0 ; i < list2.length ; i+=2) {
            list1[i] = (int) (Math.random() * 10) ; 
            System.out.println("Element at index " + i + " = " + list1[i]);
            System.out.println("Rest elements = 0");
        }
        
    }
    
}