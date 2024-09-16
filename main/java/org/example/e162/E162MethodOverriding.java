package org.example.e162;

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println("I am an animal eating");
    }

    protected void sleep() {
        System.out.println("I am an animal sleeping");
    }

    void makeSound() {
        System.out.println("I am an animal making sound");
    }

    private void roam() {
        System.out.println("I am an animal roaming");
    }

}
class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    protected void sleep() {
        System.out.println("Cat sleeps a lot");
    }

    @Override
    void makeSound() {
        System.out.println("Cat makes a sound");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}

class Kitten1 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten1 eats milk");
    }
}

class Kitten2 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }
}

class Kitten3 extends Cat {
    @Override
    public void eat() {
        System.out.println("kitten2 eats snacks");
    }
}

public class E162MethodOverriding {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Kitten1();
        animals[2] = new Kitten2();
        animals[3] = new Kitten3();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
        Cat cat = new Cat();
        cat.makeSound();
    }
}
