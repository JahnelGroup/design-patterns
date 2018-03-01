# Adapter(Wrapper) Design Pattern

## What is the Adapter Design Pattern?

https://en.wikipedia.org/wiki/Adapter_pattern

The adapter design pattern is a structural design pattern that converts the interface of a class into another interface in order to interact with an existing library that it originally wasn't compatible with. When using this design pattern, the existing source code for the classes won't have to change in order to get them to work together.

##  Two Types of Adapter

There is a class and object variation of this design pattern.
The object version implements the incompatible interface by delegating to an adapter object at run-time.
The class version implements the incompatible interface by inheriting from the adapter class at compile-time.

## When Would You Want To Use It?

* When you need to use a outside class but it isn't compatible with the interface you need.

* When you want to create a class that works well with unrelated classes.


## Example Diagram

Below is a diagram of the structure of the Adapter Design Pattern in the code example.

![Adapter](src/main/resources/diagrams/AdapterDesignPattern.png?raw=true "Adapter Example")
