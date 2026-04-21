# Polymorphism

## What is Polymorphism?

Polymorphism means "many forms." It allows one reference type to behave differently depending on the actual object it is pointing to.

In Java, you can hold a child object inside a parent type variable. When you call a method on it, Java runs the child's version — not the parent's.

## The Real-World Analogy

You have a TV remote with a "Play" button. Press it while watching a DVD and it plays the disc. Press it on a music app and it plays a song. Press it on YouTube and it streams a video.

Same button. Same action. Different result depending on what device is actually responding.

That is polymorphism.

## Two Types of Polymorphism in Java

### Runtime Polymorphism (Method Overriding)

This happens when a parent reference holds a child object. Java decides at runtime which version of the method to call based on the actual object type — not the reference type.

This is the most important type and the one interviewers ask about most.

The key conditions:
- There must be an inheritance relationship
- The child must override the method
- The reference type is the parent, but the object is the child

### Compile-time Polymorphism (Method Overloading)

This happens when you have multiple methods in the same class with the same name but different parameter lists.

Java decides which one to call at compile time based on the arguments you pass.

This is simpler. It just means you can have `add(int, int)` and `add(double, double)` in the same class.

## Why Runtime Polymorphism Is Powerful

It lets you write code that works with the parent type, and it automatically works for all child types — even ones you haven't written yet.

For example, if you have an array of `Shape` objects and you call `area()` on each one, Java will automatically call the correct `area()` — whether the shape is a `Circle`, a `Rectangle`, or a `Triangle`. You don't need to check the type manually.

## What Polymorphism Does NOT Allow

When you hold a child object in a parent reference, you can only call methods defined in the parent.

If the child has extra methods that the parent doesn't know about, you cannot call them through the parent reference without casting.

This is intentional — the parent reference only knows about what the parent defines.

## Key Points to Remember

- Runtime polymorphism requires inheritance and method overriding
- The reference type can be the parent, but the object is always the child
- Java resolves method calls at runtime based on the actual object, not the reference
- Overloading is compile-time, overriding is runtime — these are different things
- Polymorphism makes code flexible and extensible without modifying existing logic
