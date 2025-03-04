# JAVA METHODS
## A method is a block of code which only runs when it is called.
pass data, known as parameters
used to perform certain actions, and they are also known as functions
used to organize our code
help us divide our program into smaller chunks to make it easier to use and understand
reduce and reorganize the complexity of the program
modularity -> one task at a time
expose the behavior of objects
resuable, write once and use it many times in different parts of the program 

#Create a Method
A method must be declared within a class.
class Main{
	static void myMethod() {
    	// code to be executed
  	}
}

Different parts of the Java Methods:
a. Method Name -> Every method has a Name which is descriptive
b. methodName() with Paraenthesis ( ) -> A method name ends with parentheses. An optional parameters can be added as input to the method.
c. Method Body { } -> body of the method which has code to perform actions indicated with the curly brackets { }
d. Return Type -> type of data the method returns

## Method does not return anything until it is called or invoked

# Calling Method in Java
object is used to call the method. When the method is called,  the program's control jumps to the method definition. 
Statements inside the method are executed first. After it is done, the program's control jumps back to the main() method and moves to the next line of code after the method call.


# Making Methods Dynamic
create methods that take input and return output
In programming terms:
a. Method Arguments or Method Parameters -> Adding arguments or parameters to methods means adding inputs to the method.Add as many as you want
b. Java return keyword -> return the results essentially returning the output of the method 


# Benefits of using Methods 
. independent piece of working code i.e write once use it anywhere
. reuseable
. increase modularity of code and makes the code less error-prone

# Java Static Method
belongs to the class rather than any specific object, call it directly using the class name without creating an object of the class.
Cannot Access Instance Variables ->  can only access other static members (variables or methods) directly.
Useful for Utility Methods


#Java Standard Library Methods
JSL provides a vast collection of pre-defined classes and methods organized into packages.
a. java.lang Package -> automatically imported, Commonly used Methods are from Math and String class eg System.out.println("") which is a System class defined in java.lang package. 
b. java.util Package -> provides utility classes like Scanner, ArrayList, and HashMap.
c. Math.random() -> get a random number from 0.0 to less than 1.0. 
