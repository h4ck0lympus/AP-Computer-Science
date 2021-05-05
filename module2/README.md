# Module2 

## Part 1 - Constructors and objects

Java is OOP lang. So it revolves around classes and objects.

- Class - blueprint/used to define new datatype 
- Object - instance of class/ created from class

![from w3 schools](https://user-images.githubusercontent.com/30211412/117099959-21dd9e00-ad90-11eb-96e3-e5eb547d25cf.png)


### Components of class 

- attributes for properties of the object - instance variables 
- behaviour of object/ method / function inside a class 

### Constructor

Constructor is a piece of code that deals with argumets that are passed to a new instance when an instance is initialized using `new` keyword. It helps in initializing instance variables.

3 arguments have to be passed: 
- owner name (string)
- make company (string)
- is sports car or not (boolean)
    
there are 3 possible valid input cases: 
- all 3 args are passed 
- car is for sale and owner is not know so 2 args are passed and owner by default set to null 
- no arg passed and string args set to null bool args set to false 
 
Normally we can only have 1 constructor in a class but for above cases we will have to had all 3 constructors and when we do so we call it overiding a constructor in object. 


### Instantation(using new keyword) 

Ok so you have created an object and now you have to make a new instance of that object. How Can we do that ? 
So for this purpose we use `new` keyword. 

**syntax:** `<Datatype> <instance name> = new <constructor>`

Now we know that classes are used to define new datatype, so datatype is nothing else than the name of the class. Instance name can be anything. 

## Part 2 - String Objects

We have 2 methods to initialize a string object: 

1. Using String literals
2. Using new keyword / instantinating

### Method-1

Method 1 is simple and we have used it in previous lecs, using `"` 

`String newString = "This is a string" ;`

### Method 2 

Method 2 is I guess more 'technical' : 

`String newString = new String("This is a string made using new keyword") ; `

### Method -3 

This is not exactly a 'method' but a mixture of both method 1 and 2: 

```java
name = "Java"; 
String NewName = new String(name);
```
### Use of `+` and `+=` 

They work in the same way as in python: 

**+** used to concatinate 
**+=** used to add string to predefined string. 

## String Methods 

String is an inbuilt object, so a class was first made named String and we initialize everytime we make some string. There are some functions in that class i.e methods which we will discuss here

### String indexing 
It works the same as indexing in any other language, first char of string denoted by index 0. 

![](https://user-images.githubusercontent.com/30211412/117084171-1ffde580-ad64-11eb-8277-8ae87b133a9d.png)

#### indexOf method

String has a inbuilt method `indexOf` which as its name says, returns the index of the given character in the string. Suppose we take a character that is repeated 
or comes more than once in a string like `t` in `computational` **indexOf will retunrn the index of very first char.**

#### substring method 

Substring method slices the string just as we do in python. 

```java
String a = "computational" ; 

// 1st  
System.out.println(a.substring(0,5)) ; 
// 2nd (overided constructor of substring method)
System.out.println(a.substring(5)) ;
```

It basically works in the same way as in python `subtring(Start,end)` 

1st statement prints = "compu"
2nd statement prints = "tational"



