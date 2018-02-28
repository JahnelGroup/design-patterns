# Prototype Design Pattern

## What is the Prototype Design Pattern?

https://en.wikipedia.org/wiki/Prototype_pattern

The prototype design pattern is a object creational design pattern that specifies the type of objects the user wants to create is determined by a prototypical instance, which is cloned to create new objects.

In this design pattern, you want to declare an abstract base class that specifies a pure virtual clone method. After that, any class that needs a "polymorphic constructor" capability: derives itself from the abstract base class, registers its prototypical instance, and implements the clone method.

## When Would You Want To Use It?

* When the classes to instantiate are specified at run-time.

* When you want to avoid creating a class hierarchy of factories that is as big as the class hierarchy of products.

## Example Diagram

Below is a diagram of the structure of the Prototype Design Pattern in the code example.

![Prototype](src/main/resources/diagrams/PrototypeDesignPattern.png?raw=true "Prototype Example")
