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

class Bird extends Animal {
    void chirp() {
        System.out.println("The bird chirps.");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("The fish swims.");
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
        Bird myBird = new Bird();
        myBird.eat();  // Inherited method
        myBird.chirp(); // Bird's own method
        Fish myFish = new Fish();
        myFish.eat();  // Inherited method
        myFish.swim(); // Fish's own method
    }
}