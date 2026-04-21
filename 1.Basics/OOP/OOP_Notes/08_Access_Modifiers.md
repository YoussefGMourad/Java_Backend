# Access Modifiers

## What Are Access Modifiers?

Access modifiers control who can see and use a field, method, or class.

They are Java's way of enforcing boundaries — deciding what is internal implementation detail and what is part of the public interface of your class.

## The Four Levels

### private

Only the class itself can access it. Nothing outside — not even a subclass — can see it directly.

This is the default choice for all fields. If a field is private, the only way to interact with it is through the methods you deliberately expose.

### default (package-private)

When you write no modifier at all, Java applies package-private access.

This means only classes in the same package can access it. Classes in other packages — even subclasses in other packages — cannot.

This is rarely used intentionally. Usually if something is not private, you want it to be protected or public.

### protected

Accessible within the same package, and also accessible to subclasses — even if those subclasses are in a different package.

Use this when you have a field or method that the parent class owns, but child classes genuinely need to access directly.

In practice, `protected` on fields is still a code smell. It is better to keep fields private and let subclasses access them through protected getter/setter methods if needed.

### public

Accessible from anywhere. Any class in any package can read or call it.

Use this for methods that are part of your class's intended interface — things you want the outside world to use.

Never make fields public. A public field means anyone can change it without going through your validation logic.

## The Practical Rules You Apply Every Day

- Fields → always `private`
- Methods intended for external use → `public`
- Methods only for subclasses → `protected`
- Internal helper methods → `private`
- Constants shared across a package → sometimes `default` or `public static final`

## Access Modifiers on Classes

A top-level class can only be `public` or default (package-private).

- `public` class → any code anywhere can use it
- default class → only code in the same package can use it

Inner classes can use all four modifiers.

## Why This Matters for OOP

Access modifiers are the enforcement mechanism for encapsulation. Without them, encapsulation is just a suggestion.

Marking a field `private` is what actually prevents other classes from bypassing your validation logic and corrupting the object's state. The rule "keep fields private" has no meaning unless you actually write `private`.

## Quick Reference

| Modifier    | Same class | Same package | Subclass (any package) | Anywhere |
|-------------|:---:|:---:|:---:|:---:|
| `private`   | ✓   | ✗   | ✗   | ✗   |
| default     | ✓   | ✓   | ✗   | ✗   |
| `protected` | ✓   | ✓   | ✓   | ✗   |
| `public`    | ✓   | ✓   | ✓   | ✓   |

## Key Points to Remember

- The stricter the access, the more protected your internal state is
- Always start with `private` and loosen only when there is a real reason to
- `protected` is for subclass access — not a shortcut to avoid writing getters
- Public fields are almost always a design mistake
- Access modifiers are how you draw the line between what is internal and what is external in your design
