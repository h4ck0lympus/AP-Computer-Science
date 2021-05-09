# Module-5

### Public access modifier 

Public access modifier "mark" the classes/methods such that they can be called and used by other classes. We always keep our constructor public so that they can be called and new instances can be made of that class

### Private access modifiers

Private access modifiers restrict the use of class/methods to a particular class where they are declared and not outside it. A method marked private can only be called within that class and not outside it 


### Methods can be public or private 

**BEWARE OF ACCESSIBILITY WHEN USING THESE KEYWORDS**

An object can call public methds of any class but not private methods. Private methods can only be called withing that class where they are initialised.  

### Why do we make instance variable 'private' when they can be changed using some methods ? 

We are controlling the data that is updated. These variables are not being change automatically, we are controlling them using those methods and private restrictions. We are providing the option of validation checks.

### Constructor 

---< Continued from module 2 >---

If not constructor is made java creates a default constructor by itself where all instance variable of type : 

- int = 0 
- double = 0.0 
- String and other objects = null  

### Typs of comments
1. `//`  Single line comments 
	- Uses :
		* Make a single line note in between the code 
		* communicate with programmers 
		* write something like TODO etc
2. ` /* */ ` Multiline commments 
	- Uses 
		* Make notes
		* communication
		* Explain working 
		* quickly comment 
3. ` /** */ ` Java doc comments **notice 2 astrericks at the beginning**
	- Uses
		* They are special comments as with a java provided tool called javaDoc that comes with java JDK, all java doc comments are pulled together and are compiled into a webpage.Hence called documentation code. 
		* There are variety of tags in comments that have specific meaning example @author @version etc. 

The comments below are importand for AP FRQs. There may be some in AP. 
#### Precondition
It is a condition that should be true prior to execution of code example value of a variable. 

#### Postcondition 

Condition that must be always true after the execution of the section of code.

### Accessor Methods 

They are important as they allow:

1. Safe access to instance variable
2. Often refered to as get methods 
3. Sometimes refered to as getters
4. If there is any need of differenct class to access the instance variables, access methods are important. 

Accessor method must be: 
- Public - So that they can be called 
- Return type must be the type of instance variable 
- Name is often *getNameOfVariable*
- No parameters

Lets do an experiment: 

```java 
// 5.4.2-Accessor-methods.java

public class Sports
{
	private String name ; 
	private int numAthletes ;
       	
	public Sport(String n, int num)
	{
		name = n ; 
		numAthletes = num ; 
	}
	
	public String getName()
	{
		return name ; 
	}
	
	public int getNumAthletes()
	{
		return numAthletes ; 
	} 
	public static void main(String[] args)
	{
		Sport volley = new Sport("volleyball",12) ;
		// lets try to print the value of volley variable 
		System.out.println(volley) ; 
		// we get : Sports@51c8530f 
	} 

}
```
What is `Sports@51c8530f` ? 

This comes from what we call object class and is in the form `classname@HashCode_in_hexadecimal_form` . This is not what we wanted, we wanted some info about that class. So can we fix this and use the same method to get some info. Answer is YES !! 

We will make a `toString` method in our class. 
**There are some rules that has to be followed while making `toString` method**
- `toString` returns a string with info about instance variable 
- It should always be `public` 
- Return type should always be a **String**
- No parameters
- When `System.out.println(object)` is called , `toString` method is called 

```java
public class Sports
{
	private String name ; 
	private int numAthletes ; 
	// constructor and other methods not shown 
	
	public String toString()
	{
		return "Sport: " + name + "\nNumber of athletes: " + numAthletes ; 
	} 
	public static void main(String[] args)
	{
		Sports volley = new Sports("volleyball",12) ; 
		System.out.println(volley) ; 
 	}

}
```
we get : 

```
Name:volleyball
Number of athletes: 12
```

### Mutator Methods 

- They allow to change the value of instance variable 
- Often refered to as set methods 
- sometimes called as setters  
- They are neccessary if we need to change the value of instance variable 

Some rules should be followed. 
- Must be public, so that objects can access it 
- Return type must be void because we aren't returning anything, instead we are changing some value 
- name is often *setNameOfVariable*
- parameter type must match the type of instance variable 

### Method Header

What does a method header looks like ?

- Access level : set by access modifier **public** or **private**
- Ownership: set by whether or not **static** is included 
- Return type: date type of the value returned by the method, can be primitive, reference or void (when no value returned)
- Identifier: the name of method 
- Parameter list: Enclosed in paranthesis, states the data type and identifier for each parameter used in method
	- A **parameter** is information need be the method to complete its task 
	- If the the method does not use parameters, the paranthesis are still needed by are left empty 

### Static and non static methods 

Static variables and methods belong to the class, they are shared between all objects 
- If an object modifies a static variable, all objects of same class are affected 
- A static variable can be accessed without creating instance of class 
- A static method can be called using same way either using the class name or directly calling it
- A static method cannot access instance variable or methods 


Multiple choice question 
```java
public class Example
{
	private static int goal = 125;
	private int current ; 

	public Example(int c)
	{
		// code segment 1 
	} 
	
	public static void resetGoal(int g)
	{
		// code segment 2 
	}
	// other methods not shown 
}
```		 
Static methods/variables can be accessed directly by static methods within that class and cannot access non static methods/variables.

A constructor is neither static or non static so it can access both static and non static variables and methods

![MCQ question](https://user-images.githubusercontent.com/30211412/117577498-9d7c7980-b107-11eb-9eb1-e7060564198b.png) 
![Options](https://user-images.githubusercontent.com/30211412/117577531-c43ab000-b107-11eb-9453-8e2bbd8c4941.png)

Lets see whats happening in the code: 

1. There is a Example class 
2. It contains 2 instance int variables - goal(static) and  current(non static)
3. A constructor which takes only 1 argument - inc c (as it cant takes static variable)and update its value  
4. A method to upate static variable goal 
5. now 2 new objects are created - e1 and e2.
6. In e1, value of current = 150 
7. In e2, value of current = 160 

So as current is not static variable its value depends upon object and can change with it but for goal 

its values is changed using the name of class because its static. Its value is changed to 145 and this remains 145 for both e1 and e2 no matter what !

So answer is **C**



### Local variables 

They are variables which are inside a method. They cannot be public or private as they are not in a class i.e they are not global/instance variables. They cannot be called outside that method. Global/instance variable can be called or updated inside a method and can be assigned value using local variables. Ex. a constructor taking a integer variable c, this c update the value of gloable variable count. 

If a local variale in declare with the same name as global variable, local variable will be given more importance i.e **global variable will not be changed**

### `this` keyword 

IN SHORT - `this` is a reference to the object.

- Within a non-static method or a constructor, the keyword `this` is a reference to the current object - the object whose method or constructor is being called. 
- The keyword `this` can be used to pass te current object as an actual parameter in a method call.

`this` can be used in couple of ways: 

- Using `this` to improve code readability 
for example : 
```java
public class Dog
{
	private String breed ; 
	// other instance variable not shown 
	
	public String getBreed()
	{
		return breed ; 
	}

	public boolean isSameBreed(Dog otherDog)
	{	
		// here in the code below it is not that clear to whom's breed we are calling by breed.equal
		// return breed.equals(otherDog.breed) ; 
		// Some programmers make this obvious and make their code more readable using this keyword 
		return this.breed.equals(otherDog.breed) ; 

	}
}
```

`this` is mostly used while making a constructor. Consider this case: 

```java
public class Dog
{
	private String name ; 
	private int age ; 
	private double weight ; 
	private double score ; 
	
	/*
	public Dog(String n, int a, double w, double s)
	{
		// now we can simply do 
		name = n ; 
		// and etc. But some programmers prefer using this keyword 
		this.age = a ; 
		this.weight = w ; 
		// Now we can also extend this to next level
		// String n, int a ....  is not that meaningful we can change it to their exact names
		
	}
	*/
	public Dog(String name, int age, double weight, double score)
	{
		// name = name is illegal so we use this keyword
		this.name = name ; 
		this.age = age ; 
		this.weight = weight ; 
		this.score = score ; 
	}

}
```

This is how we make our code look better by using this keyword 

