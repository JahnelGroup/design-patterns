# Bridge Design Pattern

## What is the Bridge Design Pattern?

https://en.wikipedia.org/wiki/Bridge_pattern

The bridge design pattern is a object structural design pattern that decouples an abstraction from its implementation so that the two can vary independently.
There are usually 2 levels of abstraction needed to implement this design pattern.
The first level is the interface that defines the highest level of design.
The second level is the abstract class that uses the interface.
With this set in place, you are able to change any concrete class that extends the abstraction without having to change the interface.

## When Would You Want To Use It?

* When you want to avoid a permanent binding between abstraction and its implementation.

* When the changes in the implementation of an abstraction should not have an impact on clients.

* When you want to share an implementation among many objects.

## Example Diagram

Below is a diagram of the structure of the Bridge Design Pattern in the code example.

![Bridge](src/main/resources/diagrams/BridgeDesignPattern.png?raw=true "Bridge Example")
