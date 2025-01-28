// Base class for different types of animals
class Animal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Dog class, extends Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

// Parrot class, extends Animal
class Parrot extends Animal {
    public void talk() {
        System.out.println("Talking...");
    }
}

// Blacksheep class - Fish doesn't fit into the same hierarchy
class Fish extends Animal {
    // Fish doesn't have a method like 'bark' or 'talk' but still inherits from Animal
    public void swim() {
        System.out.println("Swimming...");
    }
    
    // Fish doesn't need to "eat" or "sleep" like other animals
    @Override
    public void eat() {
        // Fish eats differently but inherits this method from Animal
        System.out.println("Eating fish food...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        
        Animal parrot = new Parrot();
        parrot.eat();
        parrot.sleep();
        
        Animal fish = new Fish(); // Fish inherits from Animal, but doesn't fit
        fish.eat();
        fish.sleep();
        // fish.bark(); // Can't bark like a dog!
        ((Fish) fish).swim(); // Fish-specific behavior, but using type casting
    }
}
//


//Abstract Animal class for shared behaviors
abstract class Animal {
 public abstract void eat();
 public abstract void sleep();
}

//Dog class
class Dog extends Animal {
 public void eat() {
     System.out.println("Eating dog food...");
 }

 public void sleep() {
     System.out.println("Dog is sleeping...");
 }

 public void bark() {
     System.out.println("Barking...");
 }
}

//Parrot class
class Parrot extends Animal {
 public void eat() {
     System.out.println("Eating seeds...");
 }

 public void sleep() {
     System.out.println("Parrot is sleeping...");
 }

 public void talk() {
     System.out.println("Talking...");
 }
}

//Fish class now stands separately
class Fish {
 public void swim() {
     System.out.println("Swimming...");
 }

 public void eat() {
     System.out.println("Eating fish food...");
 }

 public void sleep() {
     System.out.println("Fish is sleeping...");
 }
}

public class Main {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat();
     dog.sleep();
     dog.bark();
     
     Parrot parrot = new Parrot();
     parrot.eat();
     parrot.sleep();
     parrot.talk();
     
     Fish fish = new Fish();
     fish.eat();
     fish.sleep();
     fish.swim();
 }
}
