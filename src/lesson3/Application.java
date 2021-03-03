package lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<Animal>();

        Animal animal1 = new Animal("dog", 12);
        Animal animal2 = new Animal("cat", 8);
        Animal animal3 = new Animal("bird", 3);
        Animal animal4 = new Animal("dog", 12);
        Animal animal5 = new Animal("kangaroo", 24);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animals);

        System.out.println(animal1.equals(animal4));
        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());

        for (Animal value : animals) {
            System.out.println(value);
        }
    }
}
