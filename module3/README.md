# Module 3 

## Boolean Operations 

Boolean operations means operations which only have 2 answers either **True** or **False**. 

There are many Boolean operators through which we do boolean operations: 


| Boolean Operator 	|        Meaning        	|
|:----------------:	|:---------------------:	|
|         >        	|       More Than       	|
|         <        	|       Less than       	|
|        ==        	|        equal to       	|
|        >=        	| More than or equal to 	|
|        <=        	| Less than or equal to 	|
|        !=        	|      Not Equal to     	|
|        &&         |           and             |
|        ||         |           or              |
 

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

### nested if-else

As we know indentation does not matter in java so which else belong to which if, this can coz' confusion. Solution - nearest `if` of `else` is considered to overide this, we use curly brackets `{ }`

