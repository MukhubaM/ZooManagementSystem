# Zoo Management System

A Java-based Zoo Management System built to demonstrate **Object-Oriented Programming (OOP)** concepts such as **inheritance, polymorphism, encapsulation and abstraction**. The system simulates a zoo environment where animals can be added, viewed and searched, each with unique behaviors like sounds and diets. It also includes exception handling to ensure smooth user interaction.

---

## Features
- **Add Animals**: Create new animals by specifying their species and name.
- **View Animals**: Display all animals with details such as name, species, sound and diet.
- **Search Animals**: Find animals by name quickly.
- **Polymorphism in Action**: Each subclass (Lion, Elephant, Bird, Tiger, Bear, Wolf, Zebra, Hyena, Gorilla) overrides methods like `makeSound()` and `eat()` to reflect real-world behavior.
- **Exception Handling**: Protects against invalid user input (e.g., entering letters instead of numbers in the menu).

---

## Object-Oriented Concepts Demonstrated
- **Inheritance**: All animals inherit from the base `Animal` class.
- **Polymorphism**: Methods like `makeSound()` and `eat()` behave differently depending on the subclass.
- **Encapsulation**: Animal properties (name, species) are private with getters and setters.
- **Abstraction**: The `Animal` class defines generic behaviors, while subclasses provide specific implementations.

---

## Technologies
- Java SE
- Console-based input/output
- IntelliJ IDEA (recommended IDE)

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/MukhubaM/ZooManagementSystem.git

#CodingWithCuba
