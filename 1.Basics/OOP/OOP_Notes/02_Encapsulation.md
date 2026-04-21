# Encapsulation

## What is Encapsulation?

Encapsulation means hiding the internal data of an object and only allowing access to it through controlled methods.

The idea is that no one outside the class should be able to directly read or change the object's fields. Instead, they go through methods that you define and control.

## The Real-World Analogy

Think of an ATM machine. You cannot reach inside and take the cash directly. You press buttons — the ATM decides what happens. The cash is encapsulated inside the machine.

The same idea applies to your objects. The data is locked inside. Anyone who wants to interact with it must go through the methods you expose.

## How It Works in Java

- All fields are marked `private`
- If you want someone to read a field, you provide a **getter** method
- If you want someone to change a field, you provide a **setter** method — and inside that setter, you can add validation

This way, invalid data can never reach your object's state because all changes go through your controlled methods.

## Why It Matters

Without encapsulation, any part of the code can set a balance to a negative number, or set an age to 999, or leave a name as null.

With encapsulation, you write the rules once inside the setter, and those rules are always enforced — no matter who uses the class.

## Immutability

Some objects should never change after they are created. For example, an employee's ID or a transaction reference number.

For these fields you use the `final` keyword. A `final` field can only be assigned once — in the constructor. After that it cannot be changed. You provide a getter but no setter.

This is a stricter form of encapsulation and it makes objects safer and easier to reason about.

## Key Points to Remember

- Always make fields `private`
- Expose only what needs to be exposed through `public` methods
- Add validation inside setters to protect the object's state
- Use `final` on fields that should never change after creation
- Getters return a copy of the value — they do not expose the field itself
