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

![](https://user-images.githubusercontent.com/30211412/118001308-3dceda00-b364-11eb-806e-10639b85bd84.png)

##### Superclass constructors are not inhereted by subclasses. 

----------

Consider the code below : 

```java
public class Performer
{
    private String name ; 
    private int age ; 

    public Performer() 
    {
        name = "Ima performer" ; 
        age = 16 ; 
        
    }
    public Performer(String name,int age)
    {
        this.name = name ; 
        this.age = age ; 
    }

}

public class Musician extends Performer
{
    private String instrument ; 
    public Musician()
    {
        instrument = "Piano" ; 
    }
    public Musician(String instrument) 
    {
        this.instrument =   instrument ; 
    }
}
```

what will happen if we make a main method and make a `Musician` object ? 

```java
public static void main(String[] args)
{
    Musician branford = new Musician("saxophone") ; 
}

```

It will call the constructor of subclass musician but it will also call supercall constructor. So what if we don't want this. 

## `super()` 

- Using super() will call the no argument constructor of the superclass 
- if you dont include a call to super() in your constructor, Java inserts a call to body of constructor 
- Whether the superclass constructor is called implicitly or explitly, the process of calling superclass constructor continues up the inheritence hierarchy, with each constructor calling the constructor of its superclass. 

`super()` is just a keyword to superclass constructor, so if we pass the values to it will call the constructor that matches the pattern of that constructor.

So we can use this to pass the values to superclass constructor to using the subclass constructor : 

```java
// we can add this constructor in Musician subclass
public Musicican(String name, int age, String instrument)
{
    super(name,age) ; 
    this.instrument = instrument ; 
}
```

**Note Its still the first line of constructor body. When you are writing constructors its very IMPORTANT that you use super in first line**

![2021-05-12_20-53](https://user-images.githubusercontent.com/30211412/118034456-9fed0680-b387-11eb-8361-970856a29e47.png)

