class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

class Puppy extends Dog {
    int milkTeeth;

    Puppy(String name, int age, String breed, int milkTeeth) {
        super(name, age, breed);
        this.milkTeeth = milkTeeth;
    }

    @Override
    void makeSound() {
        System.out.println("Puppy yaps");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Milk Teeth: " + milkTeeth);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Animal Info");
        Animal myAnimal = new Animal("Generic", 5);
        myAnimal.displayInfo();
        myAnimal.makeSound();

        System.out.println("\nDog Info");
        Dog myDog = new Dog("Buddy", 3, "Pug");
        myDog.displayInfo();
        myDog.makeSound();

        System.out.println("\nPuppy Info");
        Puppy myPuppy = new Puppy("Small", 1, "Husky", 28);
        myPuppy.displayInfo();
        myPuppy.makeSound();
    }
}
