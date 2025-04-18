// Parent class
class Animal {
  void eat() {
    System.out.println("Animal is eating.");
  }
}

// Subclass inheriting from Animal
class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks: Woof Woof!");
  }
}

public class InheritanceDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // Inherited behavior
    dog.bark(); // Specific behavior
  }
}