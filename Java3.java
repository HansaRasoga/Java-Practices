class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Java3 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited method
        myDog.bark();  // Dog's own method
        Cat myCat = new Cat();
        myCat.eat();   // Inherited method
        myCat.meow();  // Cat's own method
    }
}