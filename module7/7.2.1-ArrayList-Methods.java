




import java.util.ArrayList ; 

public class methods
{
    public static void main(String[] args) 
    {
        ArrayList<String> arr1 = new ArrayList<String>() ; 
        System.out.println(arr1.size());  // prints 0 as it is empty arraylist
        
        // add method - Just like append of python list 
        arr1.add("Hello") ; 
        System.out.println(arr1.size()); // we will get 1 as there is an object  
        arr1.add("HELLO") ; 
        arr1.add(1,"hola") ; 

        // remove first element
        arr1.remove(0) ; 
        // replace HELLO(1 index) with Hello
        arr1.set(1, "Hello") ; 
        

    }
}