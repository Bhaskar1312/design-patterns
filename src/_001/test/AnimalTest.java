package _001.test;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.makeSomeAnimals();
    }

    private void makeSomeAnimals() {
        Animal dog = new Dog();
        Animal cat = new Cat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.forEach(Animal::makeSound);
    }

    public interface Animal {
        void makeSound();
    }
    public class Dog implements Animal {
        public void makeSound() {
            bark();
        }
        void bark() {
            System.out.println("Woof");
        }
    }

    public class Cat implements Animal {
        public void makeSound() {
            meow();
        }
        void meow() {
            System.out.println("Meow");
        }
    }
}
