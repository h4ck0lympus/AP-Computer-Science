# Module 7 - ArrayLists

It is a prewritten class, which is based in arrays. It is a part of `collections` framework.  

## Vocabulary 

- Arrays are **static** in size 
- Arraylist are **dynamic** in size, their size can be changed at any time 

<<<<<<< HEAD
![2021-05-10_15-05](https://user-images.githubusercontent.com/30211412/117640478-b4bc7500-b1a2-11eb-9af8-d8987e865192.png)
=======
## How to use ArrayLists 

In order to use class `ArrayLists` we need to import `java.util` package. 

```java
import java.util.ArrayList ;  
```` 

or 

```java 
import java.util.List ; 
```

## Declare a variable to reference an `ArrayList` object

ArrayList<`Datatype`> variable_name ; 

<<<<<<< HEAD
>>>>>>> 138926a (Update README.md)
=======
List<`DataType`> variable_name ; 
>>>>>>> b325481 (7.1.1 added)

## Instantiate an arraylist object 

ArrayList<`DataType`> objectName = new Arraylist<`DataType`>() ; 

List<`Datatype`> objectName      =  new List<`DataType`>(n)  ; 
                                                         |
                                                    No of elements


Example: 

```java
import java.util.ArrayList ; 
public class example 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a1 = new ArrayList<Integer>() ; 
        ArrayList<String> a2 = new ArrayList<String>(5) ; 
        ArrayList<Student> a3 = new ArrayList<Student>() ; 
    }
}
```

## ArrayList Methods 

