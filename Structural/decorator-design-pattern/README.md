# Decorator Design Pattern

## What is the Decorator Design Pattern?

https://en.wikipedia.org/wiki/Decorator_pattern

The decorator design pattern is a object structural design pattern that allows you to attach additional functionality to an object dynamically. The structure of the object doesn't need to be altered in any manner. This design pattern gives you an alternative to using subclassing for adding functionality, which is a lot less flexible.

In order to implement this design pattern, you will need a interface that the client will interact with. This interface will be implemented by the concrete classes that will be decorated, and by the classes that will be decorating the classes mentioned before. The concrete class and the decorator classes should implement the same interface because the client should be able to interact with the object the same way regardless of the amount of decorators that are attached to the object.
When you want to attach an decorator to an object, pass the object into the decorator class's constructor. The decorator class should contain the same methods as the original object. When one of those methods are called, The decorator will use the object's method along with any other added logic or functionality need from the decorator.

## When Would You Want To Use It?

* When you want to add responsibilities to individual objects dynamically without affecting other objects

* When you want to add responsibilities that can be withdrawn from an objects

* To avoid the amount of subclass combinations you will need to create for each functionality scenario.

## Example Diagram

Below is a diagram of the structure of the Decorator Design Pattern in the code example.

![Decorator](src/main/resources/diagrams/DecoratorDesignPattern.png?raw=true "Decorator Example")
