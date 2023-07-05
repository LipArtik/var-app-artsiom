package by.itstep.oop.inh.animals;

import by.itstep.oop.Person;

public class Tester {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.setName("Tigra");
        tiger.attack();
        tiger.eat();
        tiger.play();
        tiger.sleep();

        Dog dog=new Dog();
        dog.setName("Stich");
        dog.eat();
        dog.sleep();
        dog.serve();
        dog.voice();
        Person o1=new Person();
        o1.setName("John");
        tiger.setOwner(o1);
    }
}
