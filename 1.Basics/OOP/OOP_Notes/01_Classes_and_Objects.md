# Classes & Objects

## What is a Class?

A class is a blueprint. It defines what an object looks like and what it can do.
It doesn't hold data by itself — it just describes the structure.

Think of it like a house blueprint. The blueprint is not a house. But you can use it to build as many houses as you want.

## What is an Object?

An object is an instance of a class. It's the actual thing created from the blueprint — it holds real data in memory.

When you write `new Student()`, Java allocates memory and creates an actual object based on the `Student` class.

## What Does a Class Contain?

- **Fields** — the data (state) the object holds, like a name or an ID
- **Methods** — the actions the object can perform, like printing details or calculating a value
- **Constructor** — a special method that runs when the object is created to set its initial state

## The Constructor

The constructor has the same name as the class and no return type.
If you don't write one, Java provides a default empty constructor automatically.

When you have fields that must be set at creation time, you write a constructor that takes those values as parameters.

## The `this` Keyword

`this` refers to the current object.
It's used inside a constructor or method to distinguish between a field and a parameter that has the same name.

For example, if the field is `name` and the parameter is also `name`, writing `this.name = name` means "set the field of this object to the parameter value."

## Key Points to Remember

- A class is just a template — it uses no memory until an object is created from it
- You can create multiple objects from the same class, each with its own data
- Fields should almost always be private (this is encapsulation — covered next)
- Constructors do not return anything, not even void
