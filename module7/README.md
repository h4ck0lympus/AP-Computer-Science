# Module 7 - ArrayLists

It is a prewritten class, which is based in arrays. It is a part of `collections` framework.  

## Vocabulary 

- Arrays are **static** in size 
- Arraylist are **dynamic** in size, their size can be changed at any time 

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


List<`DataType`> variable_name ; 


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

### Size Of ArrayList 

`int size()`: returns the number of elements in the list 

returns the number of objects in ArrayList 

### add method 

Add is just like append of python list. It adds element at the end of ArrayList, if index not specified. 

**How to specify index in add ?**

add takes 2 argument : 

add(index , object)  

So if we want to add 5 in the ArrayList below at index 2 : 

| 1 	| 2 	| 3 	| 4 	|
|:-:	|---	|---	|---	|
| 0 	| 1 	| 2 	| 3 	|


we do : 

arrName.add(2,5) ; 
 
and we get : 

| 1 	| 2 	| 5 	| 3 	| 4 	|
|:-:	|---	|---	|---	|---	|
| 0 	| 1 	| 2 	| 3 	| 4 	|

![2021-05-10_18-24](https://user-images.githubusercontent.com/30211412/117662409-26a1b800-b1bd-11eb-87b1-c0a33aed4b90.png)


### Remove method 

Remove method takes only one argument an int that refers to index. It removes element at that passed index and shifts all other elements to left. 

![2021-05-10_18-24](https://user-images.githubusercontent.com/30211412/117663264-18a06700-b1be-11eb-8073-ef9c4c00bad0.png)

### Set Method 

Set method takes 2 argument : 

int index and object 

It replaces the element at position `index` with `obj`, returns the element formerly at position `index`

![2021-05-10_18-24](https://user-images.githubusercontent.com/30211412/117663822-b72cc800-b1be-11eb-85fb-dc1de2c46b4c.png)

### Get method 

takes 1 argument : `int index`

return element at that `index` . 

### ArrayList as argument to method 


```java
import java.util.ArrayList ; 


public class Argument
{
	public static void main(String[] args)
	{
		ArrayList<Boolean> ques = new ArrayList<Boolean>() ; 
		ques.add(true) ; 
		// Here we are calling method that does not change ArrayList Datatype
		myMethod1(ques) ; 
	}
	
	public static void myMethod1(ArrayList arr)
	{
		if (arr.size() > 0) {
			System.out.println(arr.get(0)) ;
		}
	}
	public static void myMethod2(ArrayList arr)
	{
		if (arr.size() > 0){
			arr.set(0,"Hello") ; 
		}
	}
}	
```
**Some points to note and think about :** 
1. we are making static because we want to use it in our static main 
2. Notice here we have not mentioned datatype. 
3. This will not pose problem because we are just accessing **but what if we want to change the value ?**

we get : 

```
Note: 7.2.2-ArrayList-as-arg-to-methods.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
true
Hello
```

So we got Hello but we also get a warning that it can be unsafe for the code we wrote. 

Lets make another method3 :
```java
public static void myMethod3(ArrayList<Boolean> arr)
	{
		if (arr.size() > 0){
			arr.set(0,"Hello") ; 
		}
	}
```

When we run this with by calling it in main, we will get an error, which is good. 

### Return ArrayList from a method 

below is allowed and will compile successfully 
```java

// class constructor and other methods not shown  
public static void methodName(ArrayList arr)
{
    return arr ; 
}
```
Below is **problematic code** and will compile but will show errors 

```java 

// class constructor and other methods not shown  
public static void methodName(ArrayList arr)
{
    arr.add("Hello") ; 
    return arr ; 
}
```

**Solution :** 

```java
// class constructor and other methods not shown  
public static ArrayList<Boolean> methodName(ArrayList<Boolean> arr)
{
    // this will return error 
    // arr.add("Hello") ; 
    arr.add(true) ; 
    return arr ; 
}

```
So in short **ALWAYS** mention datatype after arraylist `ArrayList<Datatype>`


### Traversing ArrayList 

We can traverse arraylist just like arrays, 

while using enhanced-For loops, we can't modify the value of arraylist while using them. They copy the arraylist and doesn't use the exact list, therefore **use simple for loops while doing traverse operations on ArrayLists**

We cannot change the size of ArrayList while using **enhanced for loop** .

Removing Element from ArrayList at wrong time. 

