# Composition vs Inheritance

## The Problem With Overusing Inheritance

Many beginners reach for inheritance every time they want to reuse code. This is a mistake.

Inheritance creates a tight coupling between the parent and child. If the parent changes, the child is affected — sometimes in ways you don't expect. And if the IS-A relationship wasn't genuinely true, the design becomes confusing and hard to maintain.

## What is Composition?

Composition means building a class by including other objects as fields, rather than inheriting from them.

Instead of IS-A, composition represents HAS-A.

A `Car` HAS-A `Engine`. A `Person` HAS-A `Address`. An `Order` HAS-A list of `Items`.

In each of these cases, one object owns or uses another object. There is no parent-child hierarchy — just objects working together.

## How to Decide: IS-A or HAS-A?

Ask the question out loud. If it sounds natural and true, use inheritance. If it sounds forced or wrong, use composition.

- "A Dog is an Animal" — sounds right → inheritance
- "A Car is an Engine" — sounds wrong → composition, a Car HAS-A Engine
- "A Manager is an Employee" — sounds right → inheritance
- "An Order is an ArrayList" — sounds wrong → composition, an Order HAS-A list

This simple test catches most bad inheritance decisions.

## Why Composition Is Usually Preferred

There is a well-known principle in software design: **favour composition over inheritance.**

The reasons:

1. **Flexibility** — you can swap out a composed object at any time. You can give a car a different engine without touching the Car class. With inheritance, changing the parent affects everything.

2. **No tight coupling** — the Car class doesn't care how the Engine works internally. It just calls `engine.start()`. The Engine can change completely, and the Car doesn't need to know.

3. **Avoids misuse** — inheritance should model real IS-A relationships, not just be used as a shortcut for code reuse. Composition is the correct tool for code reuse when IS-A doesn't apply.

4. **Easier to test** — you can test each component independently.

## They Are Not Enemies

Composition and inheritance are not opposites. A well-designed system often uses both.

A `SavingsAccount` might extend `BankAccount` (inheritance — IS-A) and also hold a `NotificationService` object (composition — HAS-A).

The key is using the right tool for the right relationship.

## Key Points to Remember

- Inheritance = IS-A relationship. Use when the child is genuinely a type of the parent.
- Composition = HAS-A relationship. Use when one object contains or uses another.
- Prefer composition over inheritance as a default. Reach for inheritance only when IS-A is clearly true.
- Composition gives you more flexibility and less coupling.
- Both can and often do exist together in the same design.
