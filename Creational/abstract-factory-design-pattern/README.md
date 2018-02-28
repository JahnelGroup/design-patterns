# Abstract Factory Design Pattern

## What is the Abstract Factory Design Pattern?

https://en.wikipedia.org/wiki/Abstract_factory_pattern

The abstract factory design pattern is a object creational design pattern that provides an interface for creating a group of related or dependent objects without having to specify their concrete classes.

The crucial part of this design pattern is the Abstract Factory interface itself. It defines how to create the related Products but it is up to the Concrete Factories to decide how to create the Products and which ones are created.

## When Would You Want To Use It?

* When a group of related objects are designed to be used together and you need to enforce this constraint.

* when you want to provide a class library of products, and you only want to show their interfaces.  


## Example Diagram

Below is a diagram of the structure of the Abstract Design Pattern in the code example.

![Abstract Factory](src/main/resources/diagrams/AbstractFactoryDesignPattern.png?raw=true "Abstract Factory Example")
