
// Parent class with methods that are not used by the subclass
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

    // A method not relevant for Fish
    public void breatheAir() {
        System.out.println("Breathing air...");
    }
}

// Subclass that doesn't use 'breatheAir' method
class Fish extends Animal {
    @Override
    public void eat() {
        System.out.println("Fish is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Fish is sleeping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.breatheAir();  // This doesn't make sense for Fish
    }
}

//

//Parent class without unnecessary methods
class Animal {
 public void eat() {
     System.out.println("Animal is eating...");
 }

 public void sleep() {
     System.out.println("Animal is sleeping...");
 }
}

//Subclass representing Fish
class Fish extends Animal {
 @Override
 public void eat() {
     System.out.println("Fish is eating...");
 }

 @Override
 public void sleep() {
     System.out.println("Fish is sleeping...");
 }
}

//New class for mammals that breathe air
class Mammal extends Animal {
 public void breatheAir() {
     System.out.println("Breathing air...");
 }
}

public class Main {
 public static void main(String[] args) {
     Animal fish = new Fish();
     fish.eat();
     fish.sleep();
     
     Mammal mammal = new Mammal();
     mammal.eat();
     mammal.sleep();
     mammal.breatheAir();  // Now it makes sense for Mammal
 }
}

