# Interfaces

## What is an Interface?

An interface is a pure contract. It says: "any class that claims to implement me must provide these methods."

It defines what must exist — not how it works.

## The Real-World Analogy

Think of a power socket. The socket defines a standard — two pins, specific voltage. Any device that follows this standard can plug in, whether it's a phone charger, a laptop, or a lamp.

The socket doesn't care what the device is or how it works internally. It just enforces the contract.

An interface works the same way. Any class that implements it must provide the methods it defines.

## Why Interfaces Solve What Abstract Classes Cannot

Java does not allow a class to extend more than one class. But a class can implement as many interfaces as it wants.

This is how you achieve multiple capabilities in Java without multiple inheritance.

For example, a `Robot` class can extend `Machine` and also implement `Walkable`, `Talkable`, and `Chargeable`. Each interface adds a capability without any inheritance conflict.

## Interface vs Abstract Class — Choosing the Right One

Ask yourself one question: does the relationship make sense as IS-A, or does it make sense as CAN-DO?

- A `Dog` IS-A `Animal` → abstract class or regular inheritance
- A `Dog` CAN swim, CAN be trained → interfaces (`Swimmable`, `Trainable`)

Interfaces represent capabilities. Abstract classes represent shared identity and shared behaviour.

## What Changed in Java 8

Before Java 8, interfaces could only contain abstract methods — no implementations at all.

Java 8 introduced **default methods**. These are methods inside an interface that have a body. They exist so you can add new methods to an existing interface without breaking all the classes that already implement it.

This made interfaces more flexible, but the core purpose is still the same — defining a contract.

## Implementing Multiple Interfaces

A class can implement multiple interfaces separated by commas. It must provide implementations for all abstract methods from all the interfaces.

If two interfaces have a default method with the same name, the class must override it explicitly to resolve the conflict.

## Key Points to Remember

- An interface defines what, not how
- All methods are `public abstract` by default — you don't need to write those keywords
- All fields are `public static final` by default — they are constants, not instance variables
- A class implements an interface using the `implements` keyword
- A class can implement many interfaces but extend only one class
- Use interfaces for capabilities and contracts, not for shared state
- Java 8+ allows default methods in interfaces for backward compatibility
