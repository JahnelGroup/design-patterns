# Singleton Design Pattern

## What is the Singleton Design Pattern?

https://en.wikipedia.org/wiki/Singleton_pattern

The singleton design pattern is a object creational design pattern that is used to restrict the instantiation of a class to only one object that can be accessed from a well-known access point.

This functionality can be implemented by declaring all constructors of the class to be private and by giving the class a static method that returns a reference to the instance.

## When Would You Want To Use It?

* When there needs to be only one instance of a class and it should be accessible to the user from a well-known access point.

* Want a shared resource that will be used by many entities.

## Code Example Context
In this project, we have two versions of the Singleton Design Pattern.
We have the traditional implementation that creates the Singleton automatically within the class itself and then we have the Thread Safe implementation(Lazy initialization).
This variation, waits until something calls the instance to create the Singleton class within a synchronized block.

## Example Diagrams

Below are the diagrams to the Singleton Gradle project example.

This diagram shows what a Singleton design pattern would look like from a class standpoint.

![Singleton](src/main/resources/diagrams/SingletonDesignPattern.png?raw=true "Singleton Example")


This diagram shows what a Thread Safe Singleton design pattern would look like from a class standpoint.

![Thread Safe Singleton](src/main/resources/diagrams/ThreadSafeSingletonDesignPattern.png?raw=true "Thread Safe Singleton Example")
