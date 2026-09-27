# Video Game Character Energy Management System

A Java-based application that models a **Video Game Character Energy Management System**, demonstrating core Object-Oriented Programming (OOP) concepts and structured exception handling.

## 🚀 Features & Key OOP Concepts Implemented

### 1. Abstraction & Encapsulation
* **Abstract Base Class (`Character`):** Defines common properties (`characterID`, `energyLevel`) and an abstract method `calculateRegenRate()`.
* **Data Security:** Fields are kept `private`, and access is provided through `protected` getters and setters.

### 2. Inheritance & Validation
* **Subclass (`PlayerCharacter`):** Inherits from `Character` and adds a `playerName` field.
* **Input Validation:** Constructor validates that the initial energy level is non-negative, throwing an `IllegalArgumentException` for invalid inputs.

### 3. Polymorphism
* **Method Overriding (Runtime Polymorphism):** 
  * Overrides `displayInfo()` to include player details.
  * Specialized subclasses (`Mage` and `Warrior`) provide custom implementation for `calculateRegenRate()`.
  * Polymorphic array execution via `Character[]` array.
* **Method Overloading (Compile-time Polymorphism):** 
  * `restoreEnergy(int amount)` and `restoreEnergy(double amount)` to handle integer and double inputs.

### 4. Custom Exception Handling
* **Custom Exception:** `InsufficientEnergyException` handles scenario where requested energy exceeds the available balance.
* **Robust Error Handling:** Demonstrates structured `try-catch-finally` blocks and `multi-catch` handling.

## 🛠️ Project Structure

```text
src/
├── Character.java                       # Abstract base class
├── PlayerCharacter.java                 # Subclass of Character
├── Mage.java                            # Concrete subclass with custom regen rate
├── Warrior.java                         # Concrete subclass with custom regen rate
├── InsufficientEnergyException.java     # Custom exception class
└── Main.java                            # Main class demonstrating system functionality
