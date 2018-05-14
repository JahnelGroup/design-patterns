# Flyweight Design Pattern

## What is the Flyweight Design Pattern?

https://en.wikipedia.org/wiki/Flyweight_pattern

The flyweight design pattern is a object structural design pattern that reduces memory usage by sharing data with other similar objects.
By sharing data between similar objects, you can reduce the value of objects created.
The Flyweight design pattern reuses objects by storing existing objects in a cache within a factory interface and looks in the cache whenever a new object is needed.
If an object with an unique identifier already exists within the cache, then the object in the cache is returned.
If the unique identifier is not a part of the cache, the object will be created and then will be added to the cache for future use.
The objects fetched above are considered to be a flyweight entity. 
Flyweight objects can be used in multiple contexts simultaneously due to their 2 states: intrinsic, and extrinsic.
Intrinsic state is stored in the flyweight object and is shareable, while the extrinsic state is passed into the flyweight object when needed and is specific to the current context.

## When Would You Want To Use It?

* When an application uses a large number of objects. 

* When a group of objects can be replaced by a small number of objects who take in a external context.

* When the application doesn't depend on object identity. 

* When the memory costs are very high due to the value of objects created.


## Example Diagram

Below is a diagram of the structure of the Flyweight Design Pattern in the code example.

![Flyweight](src/main/resources/diagrams/FlyweightDesignPattern.png?raw=true "Flyweight Example")
