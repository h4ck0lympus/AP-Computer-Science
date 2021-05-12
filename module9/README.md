# Module-9 -Superclasses and Subclasses

## A Superclass - parent class 

A superclass is parent class it contains all the subclasses. 

Example :
- Performer is superclass for musician 
- Performer is superclass for Dancer 
etc ..

## A Subclass - child class 

A subclass is child class, it is found in superclass 

Example: 

- Musician is subclass for Performer class 
- Dancer is subclass for performer class 

## Why make Sub/Super class 

Sub/Super classes make job easier to organise and read code. It also makes the code. We can reuse the fields and methods of the existing class without having to write them again. A subclass inherits all the members (fields, methods, and nested classes) from its superclass.

## `extends` keyword

`extends` is a keyword to make a class - subclass. 

Example :

```java
public class performer
{
    public String getName() {....}
    public void practice() {....} 
    public void perform() {....}
}

public class Musician extends performer
{
    public String getInstrument() {...}
    public void playInstrument() {...}
}
```

This makes `Musician` a subclass under performer(becomes superclass). So subclass object can use subclass as well as superclass methods but superclass objects **can't use subclass methods** . We can make subclass a superclass by making subclass inside it . But this time `extends`  will be used with previously subclass class name. The below dia. explains clearly : 


