# java Practice
# JAVA Notes
<b>Why do we use Object Oriented Programming?</b>
<ul><li>To create an </li>
<li>Organized, </li>
<li>Flexible, </li>
<li>Modular and </li>
<li>Reusable </li>
code.</ul>

**What are some advantages/benefits of Java? / Why should we use it?**
Platform Independent (OS)
Open Source (Free of cost)
Object Oriented
Easy to learn / Simple
Portable
Secured
High Performance

**What do you mean by platform independent?**
It means that the Java program can run on any operating system. We don’t need to rewrite the code on a different platform. 

**What are bytecodes?**
Bytecodes are a set of instructions that looks similar to machine code but not limited to any specific processor.

**What is open source?**


**What is Object Oriented Programming?**


**What is an object?**
- ■ An instance of a class is another word for an actual object. 
- ■ To work with data represented by the class, we need a variable for the class. It is called an object.
- ■ It should start with uppercase and should be a noun.

**Two main components of classes and objects are: **
Attributes (variables)
Behaviors (methods)

**What are Methods?**
- ■ Methods are the functions defined inside the classes that operate on instances (Objects) of those classes. 
- ■ It should start with lowercase and should be a verb.

**Class creation Syntax:**
```
class Class_Name{

}
```
**Object creation Syntax:**
```
<code>Class_Name Object = new Class_Name();</code>
```

**Java Compilation?**
Javac stands for Java Compiler. After compilation it will create a class file in the same folder. These class files are nothing but the bytecodes.
Eg: javac HelloWorld.Java

**What are bytecodes?**
Bytecodes are machine codes (machine readable codes) that contain binary values.


**Java Interpreter?**
Java interpreter is simply called java. After compiling(creating bytecode/class file for) java program we can run the bytecode using the java interpreter.
Eg: java HelloWorld

**What is a class?**
- A class is a template for multiple objects with similar features. 
- A class library is a set of classes.

**Strings**
String is a part of the class library.

**Encapsulation**
Encapsulation in java is the process of wrapping code and data together into a single unit. 
Eg: capsule

**Inheritance**
- Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of the parent object.
- An interface is a collection of method names, without actual definitions, that indicate that a class has a set of behaviors in addition to the behaviors the class gets from its superclasses. 

**Polymorphism**
It is the ability of a programming language to process objects depending on their class.

**Interfaces**


**Packages**


**Unions and Structures**
Unions and Structures are not supported.

**AWT**
The Abstract Window Toolkit (AWT) is Java's original platform-dependent windowing, graphics, and user-interface widget toolkit, preceding Swing. The AWT is part of the Java Foundation Classes (JFC) — the standard API for providing a graphical user interface (GUI) for a Java program.

**Statements**
Everything, every line is a statement in Java. It ends with a semicolon(;) at the end. Also known as member elements or fields.

**Identifiers**
Identifiers are the name given to various program elements like variables, class, methods, constants, etc.

**Variables**
- Variables are used to store values. They occupy memory space. They have a name, type and a value.
- There are 3 types of variables in Java:
- Instance variable (object variables)
- Class variable (applies to all classes)
- Local variable (declared within the method or blocks)

Java language is case sensitive. Variables ‘X’ and ‘x’ are different ones.

**Literal**
Any constant value which can be assigned to the variable is called literal/constant.

**new**
To create a new object new is used. Memory is allotted for the new instance created for a given class. Constructors are the special methods for creating and initializing new instances of classes. 

On creating our own classes, we can create as many constructors as we want.

**Memory Management**
Memory management in java is automatic and dynamic. When we create an object in java,  it automatically allocates a certain amount of memory in heap. We don’t need to allocate memory for objects explicitly.

**Syntax for creating an object variable: (using dot ‘.’)**
ObjectName.variable;

**Class variables**
Class variables are created and stored in class itself. Their values are applied to the class and all of its instances. 

Class variable is created by using the static keyword before the variable.
Eg: 
```
class FamilyMember {
static string surname = “Johnson”;
String name;
Int age;
}
```

**Reference to objects**
When we assign objects to variables, or pass objects as arguments to methods, you are passing references to those objects, not the objects themselves or copies of objects. 

**Casting and Converting objects and Primitive types**
Casting is the mechanism of converting the value of an object or primitive type into another type. It does not affect the original object or value.

**Data types**
Primitive / Value types: int, float, boolean
Object / Reference types: String, Point, Window, etc.,

**Types of casting and conversion:**
Casting between Primitive type 
i) For converting smaller types to larger ones, no need to use explicit cast. It automatically converts. Eg: int to float, int to long,..
ii) To convert larger values to smaller types use explicit cast.
**Syntax: **
<code>(typename) value</code>
**Eg:**
<code>(int) (x/y);</code>

**Casting between Object types**
Syntax: (classname) object
Object of one class can be cast into an object of another class. For this the class has to be inherited. That is, we can cast the object of one class to the object of another subclass or superclass only. 
**Syntax:**
(classname) object
**Eg:**
```
GreenApple a;
Apple a2;
a = new GreenApple();
a2 = (Apple) a;
```
Objects can also be cast to interfaces, but the interface has to be implemented from its class or superclass.


**Converting primitive types to Objects and vice versa**
java.lang package includes several special classes that correspond to each primitive data type. Integer for int type, Float for float type, etc.,
Eg:
```
Integer intObject = new Integer(35);	
//converts value(primitive) into object
To convert objects back to primitive:
int theInt = intObject.intValue();	// returns 35
```

- **Java Class Libraries**
- java.lang 
- java.util 
- java.io 
- java.net 
- java.awt 
- java.applet 

**Arrays**
Array is used to store multiple values / list of items. Arrays can contain any type of values but we cannot store different types in a single array. (Like array of integers, array of strings,..)
An array is a finite ordered collection of homogeneous data elements.
Syntax: <code><data_type> <arrayName>[ ] ;
Eg: int temps[ ]; 
or 
int[ ] temps;</code>

**Allocating memory for an array**
Syntax: <code><arrayName> = new <type>[<size>];</code>
Eg: <code>x = new int [100];</code>

**Defining and allocating memory together**
Syntax: <code><type> <arrayName> [ ] = new <type> [<size>];</code>
Eg: <code>int x [ ] = new int [100];</code>

**2D Arrays**
Eg: <code>int myArray [ ] [ ] = {{1, 2, 3}, {4, 5, 6}};</code>

**Creating Array Objects**
There are 2 ways:
Using a new operator to create a new instance of array.
Eg: <code>String[ ] names = new String[10];</code>
or
<code>int[ ] temps = new int[99];</code>

When you create an array object using new, all its elements are initialized for you (0 for numeric arrays, false for boolean, ‘\0’ for character arrays, and null for everything else). You can also create and initialize an array at the same time.


Instead of using new to create the new array object, enclose the elements of the array inside braces, separated by commas:
Eg: 
```
String[ ] chiles = { “jalapeno”, “anaheim”, “serrano,”  “habanero,” “thai” };
```

**Multidimensional Arrays**
Java does not support multidimensional arrays. Instead we can use an array of arrays.

**Conditional Operator:**
An alternative / simple method instead of if condition.
**Syntax: **
Condition ? true_statement : false_statement

**Switch conditions**

**Syntax:**
switch (test) {
case value1:
Statement;
break;
case value2:
Statement;
break;
case value3:
Statement;
break;
default: statement;
}

**For loop**
It is used to execute a block of statements repeatedly for a certain number of times.
syntax:
```
for(initial_value; test_condition; increment) {
statement;
}
```

**While loop**
The while loop is used to repeat a statement or block of statements as long as the condition is true.
Syntax:
```
while (condition) {
 bodyOfLoop;
}
```

**Dowhile loop**
while loops test the condition before looping,making it possible that the body of the loop will never execute if the condition is false the first time it’s tested.
syntax:
```
do {
 bodyOfLoop;
} while (condition)
```

**Constants**
Constants are useful for setting global states in a method or object, or for giving meaningful
names to object-wide values that will never change. In Java, you can create constants only for
instance or class variables, not for local variables. 

A constant variable is something that does not change.
Eg: the value of pi = 3.1415..
The only way to define constants in Java is by using the final keyword.
Eg: <code>final int val = 0;      //constant variable ‘val’</code>

**Defining Methods**
**Syntax:**
```
return_type method_name (type1 arg1, type2 arg2) {
…………..
…………..
}
```

For a method that is returning an array object, use square brackets after the type.
**Syntax:**
```
int[ ] makeRange(int upper, int lower) { …. }
```

**this keyword**
this refers to the current object, and you can use it anywhere that object might appear - in dot notation to refer to the object’s instance variables, as an argument to a method, as the return value for the current method, and so on.
■ this is used to reduce name-space collision.
■ this can be used inside any method to refer to the current object.

Eg: this.x;
```
this.myMethod(this);
……..
return this;
```

Eg: 
```
class A{
void m() { System.out.println(“Hello m”); }
void n();
System.out.println(“hello n”);
this.m();
}
}

class Demonstration{
public static void main(String args[]){
A a = new A();
a.n();
}
}
```

this keyword is used;
- To access the instance variables and methods of the current object.
- To invoke the current class constructor using this() or this(args).
- To pass the current object as an argument to another method or constructor.
- To return the current object from a method.
- To resolve the ambiguity between instance variables and local variables that have the same name.
Ref: <link>https://javabeginnerstutorial.com/core-java-tutorial/this-keyword-java/</link>

Eg: for different types of this. declarations


**Passing arguments to methods**
Primitive types are passed by value, object/instance of class are passed by reference.
Eg: 
```
class RangeClass {
int[] makeRange (int lower, int upper) {
int arr[] = new int[ (upper - lower) + 1 ];
for (int i = 0; i < arr.length; i++) {
arr[i] = lower++;
}
return arr;
}

void methodOne(){
System.out.println("Inside Method ONE");
}

void methodTwo(){
System.out.println("Inside Method TWO");
methodOne();	// same as calling methodOne()
}

public static void main (String arg[]) {
int theArray[];
RangeClass rc = new RangeClass();
RangeClass theRange = new RangeClass();

theArray = theRange.makeRange(1,10);
System.out.print("The array: [ ");
for (int i = 0; i < theArray.length; i++) {
System.out.print(theArray[i] + " ");
}
System.out.println("]");
    rc.methodTwo();
}
}
```

**Variable Scope and method definition**
Eg: 
```
class ScopeTest {
 int test = 10;		//instance variable / class variable
 void printTest () {
 int test = 20;		//local variable
 System.out.println(“test = “ + test);		// output will be 20 
 }
}
```

The local variable hides the instance variable. To print the value of an instance variable we have to use this.test to refer to the instance variable.

**Class Methods**
To define class methods, use the static keyword in front of the method definition, just as you
would create a class variable. For example, the max class method might have a signature like this:
Eg: <code>static int max (int arg1, int arg2) { ... }</code>

**The signature for the main() method:**
```
public static void main (String args[]) 
{
……..
}
```
Here’s a run-down of the parts of the main() method:
- ■ **public** means that this method is available to other classes and objects. The main()
- method must be declared public.
- ■ **static **is the keyword. Here it refers to a class method (Method belonging to a class). We don’t need an object to call this method.
- ■ **void **is the return type, void indicates that the main() method doesn’t return anything.
- ■ **main() **is the method name. We don’t call the main method anywhere, so it's the starting point.
- ■ **String **refers to String class.
- ■ **args[ ]** is the array of string objects. It is the array of any(variable) size. We can write anything instead of args like String x[ ].

(NOTE: Java sees everything as string objects.)


The body of the main() method contains any code you need to get your application started:
initial variables or creating instances of any classes you may have declared.

**Arguments**
The arguments that we pass in the java program will be stored as an array of strings. To treat them as non-strings we have to convert them into whatever the type we want.
Eg: 
```
for (int i = 0; i < args.length; i++) {
 sum += args[i];
 }
 ```
Here the code will get an error on compilation because sum is of int type and args[i] is of array type. To solve this error we should write as:
```
for (int i = 0; i < args.length; i++) {
sum += Integer.parseInt(args[i]);
 }
```

**Constructors**
■ Constructors always have the same name as the class.
■ Constructors don’t have a return type.
■ The constructor is executed before the main function in Java. 
■ A constructor is a special method/function that is used to initialize an object. 
■ The constructor is called when an object is created using the new keyword. 
■ A constructor can have parameters, and it can be used to initialize the instance variables of the class.

**Overriding Constructors**
Constructors cannot be overloaded technically. But

**Finalizer Method**
Finalizer methods are called just before the object is garbage collected and its memory reclaimed. It is the opposite of the constructor method.
Syntax:
```
void finalize() {
 ...
}
```
In most cases we don’t need to use finalize.

**Naming Conventions**
- Class - Start with Uppercase, use nouns. 
- Interface - Start with Uppercase, use adjectives. Eg: Runnable, Printable, ActionListener,..
- Variable - . Start with Lowercase, use nouns, avoid one character variables like x,y,z. Eg: int id;
- Constant - . Use all Uppercase, separate by using underscore Eg: static final int MAX_VALUE;
- Method - Start with Lowercase, use verbs. Eg: void add();

**Pointers**
Java does not have pointers.

**import statement**
When we want to use some special class defined somewhere then we should use import.
Eg: import java.lang.*;

**Command Line Input**
```
public class Echo
{
public static void main(String args[]) 
{ 
for (int i=0;i<args.length;i++) 
{
	System.out.print(args [i]+" "); 
	System.out.print("\n");
}
System.exit(0);
}
}
```

Output:
Numeric Input to Program
```
import java.lang.*;

class Calculator{
double i;
double x = Math.sqrt(i);
}

class Example {
public static void main(String args[]) {
Calculator a= new Calculator ();
a.i= Integer.parseInt(args[0]);
System.out.println("Square root of "+a.i+" is "+a.x);
}
}
```
Here, Integer.parseInt(args[0]) gets the string input and converts string into integer using Integer.parseInt. 

2) Input with Scanner class
Scanner is a predefined class used for reading the data dynamically from the keyboard.
Scanner can read values as integer, float and also string. 


Import Scanner class using import statement.
Create an object for Scanner class.
Define variables to get input from the keyboard.
Assign variables to Object_Name.nextInt() to get input. (nextInt for reading one after another)
Eg: To get char input
```
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
```
(Using Scanner and ArrayList)
```
import java.util.*;
class SimpleArrayList{
public static void main(String args[])
{
int sum = 0;
float avg = 0;
ArrayList <Integer> l = new ArrayList<Integer>();  //Array list with array object ‘l’
System.out.println("Enter the input ");
Scanner input = new Scanner(System.in);
while (input.hasNextInt())	//Reads input till we give integer values
{
l.add(input.nextInt());
}
for (int i = 0; i < l.size(); i++) {
sum = sum+l.get(i);	//takes the ith element of array list ‘l’
}
avg = sum/(l.size());
System.out.println("Average : " + avg);
}}
```
3) Input using InputStreamReader class
DataInputStream (depreciated) / BufferedReader & InputStreamReader
```
import java.io.*;
class InterestCalculator
{
public static void main(String args[]) // throws IOException 
{
try{
float principalAmount = 0;
float rateOfInterest = 0;
int numberOfYears = 0;
String tempString;
//DataInputStream in = new DataInputStream(System.in);
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//BufferedReader & InputStreamReader classes are defined in 'io' package, 'reader' is the object
String tempString;
System.out.println("Enter Principal Amount: ");
System.out.flush();			
//clean the buffer
tempString = reader.readLine();
principalAmount = Float.parseFloat(tempString);	
//string value is converted into float value
System.out.println("Enter Rate of Interest");
System.out.flush();
tempString = reader.readLine();
rateOfInterest = Float.parseFloat(tempString);
System.out.println("Enter Number of Year");
System.out.flush();
tempString = reader.readLine();
numberOfYears = Integer.parseInt(tempString);
// converts string into integer
// Input is over: calculate the interest
float interestTotal = principalAmount*rateOfInterest*numberOfYears;
System.out.println("Total Interest = " + interestTotal) ;
System.out.printf("Formatted Output = %.4f\n", interestTotal);  
System.out.printf("Width of 20 characters before decimal = %20.4f\n", interestTotal) ;
}
catch(Exception ex) { }
}}
```
Here, %.4f refers to 4 digits after decimal, \n for new line as we have given printf, which is a formatted print statement, %20.4f refers to 20 characters before decimal and 4 digits after decimal.

Scope Rule
Class Scope
```
import java.util.*;
class Box{
	float x = 1;
	float y = 2;
	float length = 12;
	float width = 6;
	double area(){
		return(length*width);
	}
}
class Circle{
	float x = 11;
	float y = 12;
	float radius = 5;
	double area(){
		return(3.14 * radius * radius);
	}
}
class ScopeRule{
	static float x = 10;
	float y = 20;
public static void main(String args[])	{
	Box b1 = new Box();
	Circle c1 = new Circle();
	System.out.println("Main class data: " + x);
	System.out.println("Box class data: " + b1.x);
	System.out.println("Circle class data: " + c1.x);
	System.out.println("======================");
	System.out.println("Box Area: " + b1.area());
	System.out.println("Circle Area: " + c1.area());
}
}
```
Block Scope


Instance variables and Class variables
Java does not allow global variables.
Every variable in Java must be declared inside a class.
The keyword static is used to make a variable just like a global variable.
A variable declared with a static keyword is called a class variable.
It acts like a global variable, that is, there is only one copy of the variable associated with the class. That is, one copy of the variable regardless of the number of instances of the class.

Static Method
Static methods have the keyword static before the method name.
We don’t need an object to call a static method.
Eg: 
```
public static class Circle{
	float x = 11;
	float y = 12;
	float radius = 5;
	double area(){
		return(3.14 * radius * radius);
	}
}
class Box{
	float x = 1;
	float y = 2;
	float length = 12;
	float width = 6;
	double area(){
		return(length*width);
	}
}

class ScopeRule{
	static float x = 10;
	float y = 20;
public static void main(String args[]) {
	Box b1 = new Box();
System.out.println("Box class data: " + b1.x);
System.out.println("Circle class data: " + Circle.area());
}}
```
Nested Class




Static Nested class 
A static nested class is a static member of the outer class. It does not have access to the instance variables / objects of the outer class.
You can create an instance / object of a static nested class without creating an instance of the outer class.
Eg: 
```
public class Outer {
    static class Nested {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested nestedObj = new Outer.Nested();
        nestedObj.display();
    }
}
```
we use the dot (.) operator to create instances of inner classes using the outer class.

29-02-2024
Recursion in Java
```
import java.util.*;
class FactorialRecursive {
	protected int factorial(int x){
		if(x==0){
			return 1;
		} else {
			return (x*factorial(x-1));
		}
	}
	public static void main(String args[]){
		FactorialRecursive x = new FactorialRecursive();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int userInput = s.nextInt();
		//int userInput = Integer.parseInt(args[0]);
		int calculatedValue = x.factorial(userInput);
		System.out.println("The Factorial of " +  userInput + " is " + calculatedValue);
	}
}
```
Output:


IMPORTANT NOTE:
The key is that each recursive call multiplies the current value of x with the result of the next smaller value. So, factorial(4) effectively multiplies 4 × 3 × 2 × 1, which equals 24.
The base case (if (x == 0) or if (x == 1)) is crucial as it ensures that the recursion stops.

Method Overriding
It is used in runtime polymorphism.
Method should have the same name as the parent class.
Method should have the same parameters as the parent class.

Super Keyword
The super keyword in Java is a reference variable which is used to refer to immediate parent class members.
Whenever you create an instance of a subclass, an instance of its parent class is created implicitly, which is referred to by super keyword.
Eg: 
```
class Animal {
String color="white";
}
class Dog extends Animal{
String color = "black";
void printColor() {
System.out.printin(color);  	// refers to subclass color “black”
System.out.println(super.color);	// refers to super class color “white”
}}
class TestSuperl{
public static void main(String args[]) {
Dog d = new Dog();
d.printColor();
}}
```

super keyword can also be used to call super class methods.

Eg: 
```
class Animal {
void eat() {System.out.println("eating...");}
}
class Dog extends Animal{
void eat() {System.out.println("eating bread...");}
void bark() {System.out.println("barking...");}
void work() {
super.eat();	// calls the superclass method
bark();
eat();}
}
class TestSuper2{
public static void main(String args([]) {
Dog d = new Dog();
d.work();
}}
```
Output:


Invoking parent class constructor
Eg: 
```
class Animal {
Animal() {			// here Animal() is a constructor of super class
System.out.println("animal is created");)
}
class Dog extends Animal {
Dog() {			// here Dog() is a constructor of derived class
super();		// this will call super class constructor - Animal()
System.out.println ("dog is created");
}

class TestSuper3{
public static void main(String args([]) {
Dog d = new Dog () ;
}
```
Dynamic method dispatch / Runtime Polymorphism
Dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time. Also, it is called Runtime polymorphism.
In this process, an overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

Eg: 
```
class Bike{
void run() { System.out.println("running") ;}
}
class Splendor extends Bike{
void run() { System.out.println("running safely with 60km");}
}
class RuntimePolymorphism{
public static void main(String args[]) {
Splendor b1 = new Splendor();
b1.run();
Bike b2 = new Bike();
b2.run();
Bike b3 = new Splendor();	//Up casting
b3.run();			// subclass method i.e., Splendor will be executed
}}
```
Output:



**Abstraction**
Abstraction is the process of hiding the implementation and showing only the functionality to the user.
Abstraction lets you focus on what object does instead of how it does.
A class declared with an abstract keyword is called an Abstract class.
Abstract Rules
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
Abstract class cannot be instantiated.i.e,. we cannot create objects for abstract class.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
A subclass of an abstract class can be instantiated if it overrides each of the abstract
methods of its super class and provide an implementation (i.e., a method body of all
of them).
Abstract classes can have only single inheritance.



Eg:



Final class
A class declared with the final keyword cannot be inherited / extended.
It is used to restrict the access of the item from its superclass to a subclass.


Abstract class with constructor



Data in the abstract class can be called using the super keyword in subclass.

Access Modifiers






Access specifiers can be prefixed before a class, method and a data member(variables).




Syntax for compiling java package:
javac -d directory java_file_name  
Eg: javac -d . B.java

The -d switch specifies the destination where to put the generated class file. You can use any directory name like /home (in case of Linux), d:/abc (in case of windows) etc. If you want to keep the package within the same directory, you can use . (dot).

Syntax to run java package accessing program:
java Package_Name.Class_Name
Eg: java pack2.B


**Private
**When a class is private all its members with its default access specifiers are also private.
Objects cannot be created outside of a private class.
Private access modifier is accessible only within the class.

Here, obj.msg() can access data in msg() even though it is declared private.


If we make any class constructor private, we cannot create class objects outside of that class.

**Protected**
Protected access modifier is accessible within a package or from outside a package but through inheritance only.
Protected access modifiers can be applied on data members(variables), method and constructor. It cannot be applied to the class.

**Public**
When a class is declared as public all its members with default access specifier are also public
Public access modifier is accessible everywhere.

**Default**
If two classes are declared as default and are in different directories then those classes are not accessible by each other.

**Package**
A package is a container for the classes that are used to keep the class name space compartmentalized.
It allows flexibility to give the same name but to many classes, that is to avoid namespace collision.
The packages in Java provide a mechanism for partitioning the class name space into more manageable chunks.
In fact, a package is both a naming and a visibility control mechanism.
It supports reusability and maintainability.

**Built-in Packages**
Packages are nothing more than the way we organize files into different directories according to their functionality, usability as well as the category they should belong to . A Java package is a Java programming language mechanism for organizing classes into name spaces.
Eg: javax.swing is a package in java providing all basic support in developing GUI project

Code reusability is the main philosophy of Object-Oriented Programming.
To power this advantage, Java has a number of packages called API bundled with the JDK.
Packages are collections of classes and interfaces to facilitate a number of ready made solutions.
A great knowledge of packages helps a Java developer to master a Java solution.

API Built-in Java Packages


A **package** is a collection of classes and each class is a collection of members and methods. Any class as well as any method and member in a package are accessible by a java program. This can be achieved by using an import statement. 


Eg:
java.util.Date toDay = new java.util.Date ( );
System.out.println (toDay) ;

The same thing but with import statement can be done as follows

import java.util.Date;
Date today = new Date ( );

Accessing Package





Procedure



**Interface**
An interface defines a set of methods but does not implement them.
All members are final and all methods are abstract. 
Static methods cannot be declared in an interface.
An interface can extend one or more interfaces.
An interface cannot implement another interface or class.

If a class implements more than one interface, the interfaces are separated with commas.
Methods that implement an interface must be declared public.
```
Syntax: class DerivedClass_Name implements Interface_Name{ 
…………….
…………….
}
```
```
Syntax: interface Another_Interface_Name extends Interface_Name{
………….
…………
}
```
Most used interfaces in Java
Iterator (in java.util package)
Cloneable ()
Serializable ()
Comparable ()

**int to string :** 
int i=10;  
String s=String.valueOf(i);

**Math class**
Math.abs() returns the absolute value of its parameter.
Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double.
Math.floor() rounds a floating point value down to the nearest integer value.
Math.max() returns the largest of its parameters.
Math.min() returns the smallest parameter.
Math.pow() takes two parameters and returns the first parameter raised to the power of the second parameter.

Day Name Finder Formula:

```
 if (month == 1 || month == 2) {
 month += 12;
 year--;
 }

int q = day;
int m = month;
int K = year % 100;
int J = year / 100;

int h = (q + (13*(m + 1))/5 + K + K/4 + J/4 + 5*J) % 7;
```

**Interfaces**
An interface is a completely abstract class that contains only abstract methods.
Defined using the interface keyword.
May contain only static final variables.
Cannot contain a constructor because interfaces cannot be instantiated.
Interfaces can extend other interfaces.
A class can implement any number of interfaces.

An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
Methods in an interface are implicitly public.
A class can inherit from just one superclass, but can implement multiple interfaces.

**instanceof**
The instanceof operator in java is used to compare an object to a specified type. We can use it to check if an object is an instance of a class, an instance of a subclass, or an instance of a class that implements a particular interface. The instanceof operator is either returned true or false. 

**Memory Allocation**
Memory allocation in java specifies the mechanism where the computer programs and services are assigned dedicated virtual memory spaces. The Java Virtual Machine splits the memory into Stack and Heap Memory.

**Stack Memory**
In Java, stack memory is used for static memory allocation and thread execution. Methods, local variables, and reference variables are all stored in the Stack portion of memory.

**Heap Memory**
Any time an object is created and allocated in Java Heap Space, it is used.  In heap memory, new objects are often formed, and references to these objects are stored in stack memory. Garbage Collection, a discrete function, keeps flushing the memory used by previous objects that have no reference. A Heap Space object can have unrestricted access throughout the program.

**Garbage Collection in Java**
Garbage collection in java is a process of destroying runtime unused objects. Garbage collectors destroy the objects automatically. A garbage collector's key goal is to allow effective use of memory.

There are two ways for requesting a JVM to run a garbage collector. 
Using System.gc() method.
Using Runtime.getRuntime().gc() method.

Garbage Collection cannot be controlled by a program. A program can only request to run the garbage collector.

**Exception Handling Keywords in Java**
Exceptions are runtime errors.
There are five keywords that we can use in exception handling.


**1. try**
We can write code that might throw an exception in the try block. A try block in Java must be followed by a catch block or finally block.
**2. catch**
In Java, the catch block is used to handle any exceptions that might occur in our software. We can only use it after the try block. For a single try block, we can use multiple catch blocks.

**3. finally**
In Java, the finally block is used to clean up code or release resources that are being used by the program. Whether or not the exceptions are dealt, the finally block is always executed.

**4. throw**
In Java, the keyword throw is used to throw an exception. It has the ability to throw exceptions explicitly. Using the throw keyword, we can throw either checked or unchecked exceptions.

**5. throws**
In Java, the throws keyword is used to declare an exception. Using the throws keyword, we can only declare checked exceptions. When we declare an exception, it is the programmer's responsibility to write the exception handling code.

**User-defined Exception in Java**
If we create our own exception, it is referred to as a Custom or User-defined Exception. Java allows us to create our own exception, which is essentially a derived class of Exception. To create our own exception, we must first create a class that extends the Exception class and represents user-defined exceptions. We must pass the string to the constructor of the super class, which is obtained by calling the getMessage() function of the newly created object.

Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.



Threads
Java is a multi-threaded programming language. This means that our program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task.
You can subdivide specific operations within a single application into individual threads that all run in parallel.







There are two ways to create a thread.
1. Extend the Thread class
Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
Then you create a new object of your class and call it's start() method to run the thread.
Example:
```
class Loader extends Thread {
  public void run() {
    System.out.println("Hello");
  }
}

class MyClass {
  public static void main(String[ ] args) {
    Loader obj = new Loader();
    obj.start();
  }
}
```
2. By Implementing the Runnable interface
The other way of creating Threads is implementing the Runnable interface. Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.
Example:
```
class Loader implements Runnable {
  public void run() {
    System.out.println("Hello");
  }
}
class MyClass {
  public static void main(String[ ] args) {
    Thread t = new Thread(new Loader());
    t.start();
  }
}
```
Implementing the Runnable interface is the preferred way to start a Thread, because it enables you to extend from another class, as well.





ArrayList
The Java API provides special classes to store and manipulate groups of objects. One such class is the ArrayList. Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.

On the other hand, ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.

When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, so it's necessary to import it before using it.

Eg: ArrayList<String> colors = new ArrayList<String>(10);


contains(): Returns true if the list contains the specified element
get(int index): Returns the element at the specified position in the list
size(): Returns the number of elements in the list
clear(): Removes all of the elements from the list

LinkedList vs. ArrayList
The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
The LinkedList is better for manipulating data, such as making numerous inserts and deletes.
In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it. It's called a LinkedList because each element contains a link to the neighboring element.

HashMap 
HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). The put, remove, and get methods are used to add, delete, and access values in the HashMap.

Example:
```
import java.util.HashMap;
public class MyClass {
  public static void main(String[ ] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Amy", 154);
    points.put("Dave", 42);
    points.put("Rob", 733);
    System.out.println(points.get("Dave")); 
  }
}
```

A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
If you try to get a value that is not present in your map, it returns the value of null.


Iterator
An Iterator is an object that enables to cycle through a collection, obtain or remove elements. 
Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the  collection. By using this iterator object, you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:
hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
next(): Returns the next object and advances the iterator.
remove(): Removes the last object that was returned by next from the collection.

Files
The java.io package includes a File class that allows you to work with files.
To start, create a File object and specify the path of the file in the constructor.
Eg:
import java.io.File;
...
File file = new File("C:\\data\\input-file.txt");

Eg:
```
import java.io.File;
public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\sololearn\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}
```
The getName() method returns the name of the file.
Note that we used double backslashes in the path, as one backslash should be escaped in the path String.

Reading a file
The constructor of the Scanner class can take a File object as input. To read the contents of a text file at the path "C:\\sololearn\\test.txt", we would need to create a File object with the corresponding path and pass it to the Scanner object.

Eg:
```
try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {

}
```
The Scanner class inherits from the Iterator, so it behaves like one. We can use the Scanner object's next() method to read the file's contents.

It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.

Multithreaded program

When threads are in execution all these threads can exchange data among themselves.
Java has built-in support for multithreading.
Java Garbage Collector is a low priority thread.
Everything about thread is readily defined in package called java.lang

Keywords:
currentThread, start, run, stop, sleep, yield, resume, suspend, setPriority, getPriority.

# Collections
![Collection](https://github.com/dhan-profile/java/assets/29054766/fc45d44a-8a17-4b98-8d03-99793f1bd157)

# Map
![Map](https://github.com/dhan-profile/java/assets/29054766/f6da543a-4a96-4234-923e-142a1f51652b)

# Interview Questions
https://drive.google.com/file/d/1FOZ_uZCpqE7o9BNYY3BWZQy-7oegewre/view?usp=sharing





