# Abstraction in Java
- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- It lets you focus on what the object does instead of how it does it.

## Ways of Achieving Abstraction
- Abstract class
- Interface

### Abstract Class
- An abstract class is a class that cannot be instantiated but can be extended by other classes.

- It can contain both normal and abstract methods.

- Abstract methods are declared without an implementation, making it necessary for the subclass to provide the implementation.

- Abstract classes can have instance variables, constructors, and concrete & static methods with implementations.

- Use the abstract keyword to declare an abstract class.

### Abstract Method
- It is a method declaration does not provide an implementation(method without body).

- It is meant to be overridden (implemented) by the subclasses or classes that implement the interface. 

- 


## Interface
- Interfaces define a contract or a set of operations that a class must implement.
- An interface can declare methods, but it cannot provide any implementation. 

- All methods in an interface are implicitly public and abstract.

- A class can implement multiple interfaces, allowing it to inherit and provide implementations for methods defined in those interfaces.

- Interfaces can be used to achieve polymorphism, where objects of different classes can be treated interchangeably based on their shared interface.

- Interfaces are useful when you want to define a common behavior that can be implemented by different classes, regardless of their class hierarchy.

### There are mainly three reasons to use interface. They are given below.

- It is used to achieve abstraction.
- By interface, we can support the functionality of multiple inheritance.
- It can be used to achieve loose coupling.