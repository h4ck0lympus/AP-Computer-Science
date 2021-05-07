# Module 3 

## Boolean Operations 

Boolean operations means operations which only have 2 answers either **True** or **False**. 

There are many Boolean operators through which we do boolean operations: 


| Boolean Operator 	|        Meaning        	|
|:----------------:	|:---------------------:	|
|         >        	|       More than       	|
|         <        	|       Less than       	|
|        ==        	|        equal to       	|
|        >=        	| More than or equal to 	|
|        <=        	| Less than or equal to 	|
|        !=        	|      not equal to     	|
|        &&        	|          and          	|
|       \|\|       	|           or          	|

**IMPORTANT:** Never compare strings using above keywords, we use `equals` and `compareTo` methods to compare strings

## `if` Statements

```java
if (condition) { 

// code if condition satisfies

} 
```

## `else` statement

if,`if` returns false then what to do in that case same as python3's/C's else


```java
if (condition) { 

// code if condition satisfies

} 
else { 
// more code here 
} 
```
```java 
if (condition) { 

    // code if condition satisfies

} 
else if (condition){ 
     // some code 
}

else if (condtion) { 
      // some code 2
}
else { 
      // more code here 
} 
```
### nested if-else

As we know indentation does not matter in java so which else belong to which if, this can coz' confusion. Solution - nearest `if` of `else` is considered to overide this, we use curly brackets `{ }`


## DeMorgan's Law 

basically a `!` sign will reverse the other sign to it opposite sign. 

![](https://user-images.githubusercontent.com/30211412/117283529-7e6db580-ae83-11eb-933b-36472f1491f9.png)
![](https://user-images.githubusercontent.com/30211412/117283537-80d00f80-ae83-11eb-8134-eb43537d089f.png)
![](https://user-images.githubusercontent.com/30211412/117284210-39964e80-ae84-11eb-9969-8e92670d7b9d.png)

## Comparing objects 

Lets make a class : 

```java 
/*
 * Programmer: HackOlympus 
 * Date: 6th May
 * Purpose: Comparing classes
 */


public class House
{
	private String color ; 
	private int size ; 
	private int bedrooms ; 

	public House(String c, int sz, int bed)
	{
		color = c ; 
		size = sz ; 
		bedrooms = bed ; 

	}

	public static void main(String[] args)
	{
		House myHouse = new House("green",1850,3) ; 
		House annasHouse = new House("Green",1850,3) ; 
		House bobsHouse ; // just initialized a null variable 
		House momsHouse = myHouse ;
  }
  }
  
  ```
Now if we compare 

 - `myHouse` with `annaHouse`  we get `false`
 
