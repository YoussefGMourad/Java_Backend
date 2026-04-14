# Inheritance

## What is Inheritance?

Inheritance allows one class to receive all the fields and methods of another class without rewriting them.

The class that shares its members is called the **parent class** (or superclass).
The class that receives them is called the **child class** (or subclass).

In Java, you use the `extends` keyword to create this relationship.

## The Real-World Analogy

A savings account is a type of bank account. It has everything a bank account has — a balance, an owner, deposit and withdrawal methods. But it also has something extra — an interest rate.

Instead of rewriting all the bank account logic inside `SavingsAccount`, you extend `BankAccount` and only add what is different.

## What Gets Inherited?

The child class gets all `public` and `protected` fields and methods from the parent.
It does not get `private` fields directly — but it can access them through `public` or `protected` methods the parent provides.

## The `super` Keyword

When the child class has a constructor, it often needs to call the parent's constructor first to set up the inherited fields.

You do this with `super()` on the very first line of the child constructor.

`super` can also be used to call a parent method that the child has overridden, if you still need the parent's version of it.

## Method Overriding

A child class can replace a method it inherited with its own version. This is called overriding.

You use `@Override` above the method. This annotation is technically optional but very important — it tells the compiler to verify that you are actually overriding a real parent method. If you misspell the method name, the compiler will catch it.

## Important Limitations in Java

- A class can only extend **one** parent class — Java does not support multiple inheritance for classes
- This is intentional to avoid the "diamond problem" — a conflict when two parents have the same method
- The solution to needing multiple inheritance is interfaces (covered separately)

## The IS-A Rule

Only use inheritance when the child class IS-A type of the parent class.

A Dog IS-A Animal — inheritance makes sense.
A Car IS-A Engine — this does not make sense. A car has an engine, it is not an engine. Use composition instead (covered later).

If you cannot naturally say "X is a Y", do not use inheritance.

## Key Points to Remember

- Use `extends` to inherit from a parent class
- Call `super()` in the child constructor to initialize inherited fields
- Use `@Override` on every method you override
- Java only allows extending one class
- The IS-A relationship must be real and logical, not forced
- `private` members are not directly accessible in the child class
