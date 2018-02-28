# Factory Method Design Pattern

## What is the Factory Method Design Pattern?

https://en.wikipedia.org/wiki/Factory_method_pattern

The factory method design pattern is a class creational design pattern that defines the interface for creating an object, but lets the subclass decide which class to instantiate.

For this design pattern, the main part is the abstract Creator interface that is implemented by all of the concrete creators. The abstract Creator class declares the factory method which returns a Product class, and the concrete creators have to decide what subclass is being returned.

## When Would You Want To Use It?

* When a class does not know ahead of time what the class of objects it must create.

* When a class wants its subclasses to specify which object is being created.


## Example Diagram

Below is a diagram of the structure of the Factory Method Design Pattern in the code example.

![Factory Method](src/main/resources/diagrams/FactoryMethodDesignPattern.png?raw=true "Factory Method Example")
