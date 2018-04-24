# Facade Design Pattern

## What is the Facade Design Pattern?

https://en.wikipedia.org/wiki/Facade_pattern

The Facade design pattern is a object structural design pattern that provides an interface that interacts with a complicated subsystem.
The interface provides an easier way to use the subsystem without having to directly interact with the subsystem's components.
The interface will contain the subsystem(s) that provides the logic needed by the client.
The pieces of the subsystem(s) will interact with each other within the facade object created from the interface.


## When Would You Want To Use It?

* When you want to provide a simple interface to a complex subsystem.

* When you want to decouple the subsystem from other subsystems and clients.

* When you want to layer the subsystems in your application.

## Example Diagram

Below is a diagram of the structure of the Facade Design Pattern in the code example.

![Facade](src/main/resources/diagrams/FacadeDesignPattern.png?raw=true "Facade Example")
