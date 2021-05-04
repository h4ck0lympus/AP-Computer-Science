# module2 

Java is OOP lang. So it revolves around classes and objects.

- Class - blueprint/used to define new datatype 
- Object - instance of class/ created from class

### Components of class 

- attributes for properties of the object - instance variables 
- behaviour of object/ method / function inside a class 

### Constructor

Constructor is a piece of code that deals with argumets that are passed to a new instance when an object is initialized using `new` keyword. It helps in initializing instance variables.

3 arguments have to be passed: 
- owner name (string)
- make company (string)
- is sports car or not (boolean)
    
there are 3 possible valid input cases: 
- all 3 args are passed 
- car is for sale and owner is not know so 2 args are passed and owner by default set to null 
- no arg passed and string args set to null bool args set to false 
 
Normally we can only have 1 constructor in a class but for above cases we will have to had all 3 constructors and when we do so we call it overiding a constructor in object. 
