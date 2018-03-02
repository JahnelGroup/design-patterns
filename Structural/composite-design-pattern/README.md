# Composite Design Pattern

## What is the Composite Design Pattern?

https://en.wikipedia.org/wiki/Composite_pattern

The composite design pattern is a object structural design pattern that treats a group of objects the same way as a single instance of the same type of object.
The main intent of the design pattern is to compose the objects into a tree structure to represent part-whole hierarchies. The tree is created using recursive composition.
In this design pattern, there are 3 parts, the Component, the Leaf/Leaves, and the Composite.
The Component is the interface that all of the objects in the tree implement.
The Composite is the concrete implementation of the Component which have other children Components under it.
The Leaf is a concrete implementation of the Component that does not have children under it.
The Leaf isn't necessary for the design pattern, but is here to show that this could be a possibility.  

## When Would You Want To Use It?

* When you want to the client to treat all the objects in a composite structure in a uniform manner.

## Example Diagram

Below is a diagram of the structure of the Composite Design Pattern in the code example.

![Composite](src/main/resources/diagrams/CompositeDesignPattern.png?raw=true "Composite Example")
