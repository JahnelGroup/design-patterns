# Builder Design Pattern

## What is the Builder Design Pattern?

https://en.wikipedia.org/wiki/Builder_pattern

The builder design pattern is a object creational design pattern that separates the construction of a complex object from its representation. Doing this, allows the same construction process to create different representations of the object.

There are 2 main parts to this design pattern: the Director and the Abstract Builder.
The Director uses the builder to build the final product. Based on what concrete builder it is given, it will build and return the a variation of the product when requested.

## When Would You Want To Use It?

* The construction process must accept multiple representations for the object that is being created.

* The algorithm for creating the object should be independent of the object itself.

## Example Diagram

Below is a diagram of the structure of the Builder Design Pattern in the code example.

![Builder](src/main/resources/diagrams/BuilderDesignPattern.png?raw=true "Builder Example")
