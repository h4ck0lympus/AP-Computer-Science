# Module 6 

## Introduction to java arrays 

![Array Vocabulary](https://user-images.githubusercontent.com/30211412/117583524-2f46af80-b125-11eb-9856-793bd01c34a6.png)

#### Array initialization:

Create an integer array of size 5 : 
```java 
int [] list1 = new int[5]; 
```

Creates an array : 

| 0 	| 0 	| 0 	| 0 	| 0 	|
|:-:	|---	|---	|---	|:-:	|

#### Updating values in an array 

To Update value 33 at index 2(remember, array starts at index 0): 

```java 
// array initialized 
int [] list1 = new int[5] ; 
// array value updated 
list1[2] = 33 ; 
list1[3] = list1[2] * 3 ; // 33 * 3 = 99
```

**Q.** What if we use a value that is above 4(length of error) or less than 0 ? 

**Ans.** We get an `OutOfBoundsError` 

#### printing array 

```java 
int [] list1 = new int[5] ; 
list1[2] = 33 ; 
list1[3] = list1[2] * 3 ; 
System.out.println(list1)  ; 
// we get this: [I@13eb8acf
// this is hash code of that array object 
// to print value of the element at index 2 we will do : 
System.out.println(list1[2]);
// and we get 33 
```

#### Create array of different datatypes 

We can create arrays of double and even booleans 

If we create an array of double of size 5, by default the elements will be 0.0 in all 5 index. 

| 0.0 	| 0.0 	| 0.0 	| 0.0 	| 0.0 	|
|:---:	|-----	|-----	|-----	|:---:	|


If we create an array of boolean by default  values will be `false` 

| false 	| false 	| false 	| false 	| false 	|
|:-----:	|-------	|-------	|-------	|:-----:	|

#### Initializer list 

Sometimes we know the values of the array, in this case we make an initilization list:
```java
double [] grades = {70.5,88.2,93.7,98.7} 
```
This will create the following array : 

| 70.5 	| 88.2 	| 93.7 	| 98.7 	|
|:----:	|------	|------	|------	|

**Notice:** we are using curly brackets and commas

MCQ Question

![2021-05-09_20-44](https://user-images.githubusercontent.com/30211412/117608784-65634e00-b17c-11eb-8410-4b1876661dba.png)


first we have to find the middle part of the odd array, which is a string. 
Then we have to find the `indexOf` find in middle string. 

So array is odd so we can do: `arrName[arrName.length() / 2]` 

This will return a string so we can directly use string methods in it like:

`arrName[arrName.length() / 2].indexOf(find)`

So option **E** is correct. 


#### Traversing an Array 

Traversing an array means to access each element of an array.

Since an array is indexed from 0 to (number of elements - 1), a standard for loop is a convinient way to accomplish traversal of an array. 

```java
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
        
    }
}
```

#### Enhanced For-Loop for arrays 

