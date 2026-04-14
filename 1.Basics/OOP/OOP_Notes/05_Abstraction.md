# Abstraction

## What is Abstraction?

Abstraction means showing what an object does without revealing how it does it.

You define the structure — the method names, what they take, what they return — but you leave the actual implementation to whoever extends or implements your class.

## The Real-World Analogy

When you press the accelerator in a car, you know it makes the car go faster. You don't need to understand the fuel injection system, the engine valves, or the combustion process.

The complexity is hidden. You only interact with the simplified interface.

## How Java Implements Abstraction

Java gives you two tools: **abstract classes** and **interfaces**.

---

## Abstract Classes

An abstract class is a class that cannot be instantiated directly. You cannot do `new AbstractClass()`.

It exists to be extended by other classes.

It can contain:
- Abstract methods — methods with no body, just a signature. Every subclass must implement these.
- Concrete methods — regular methods with a full body. Subclasses inherit these as-is or override them.
- Fields — regular instance variables

### When to Use an Abstract Class

Use it when you have a group of related classes that share some common behaviour and some common state, but each one has at least one method that must be implemented differently.

For example, all employees have a name and an ID. All employees have a salary. But how the salary is calculated differs — a full-time employee gets base plus bonus, a freelancer gets hours times rate.

The shared data and the shared logic go in the abstract class. The `calculateSalary()` method is declared abstract — each subclass fills in its own version.

---

## The Difference Between Abstract Class and Interface

This is one of the most common interview questions.

**Abstract class:**
- Can have fields (instance variables with state)
- Can have constructors
- Can have a mix of abstract and concrete methods
- A class can only extend one abstract class

**Interface:**
- Cannot have instance fields (only public static final constants)
- Cannot have a constructor
- All methods are abstract by default (Java 8+ allows default methods with a body)
- A class can implement multiple interfaces

**The rule of thumb:**
- Use an abstract class when the relationship is IS-A and subclasses share real state and partial behaviour
- Use an interface when you are defining a capability or a contract that unrelated classes can all agree to

---

## Key Points to Remember

- Abstract classes cannot be instantiated — they are only for extending
- If a class has even one abstract method, the class must be declared abstract
- A subclass must implement all abstract methods, or it must also be declared abstract
- Abstraction separates what something does from how it does it
- Abstract class = shared blueprint. Interface = shared contract.
