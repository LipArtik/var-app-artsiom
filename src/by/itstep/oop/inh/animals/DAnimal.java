package by.itstep.oop.inh.animals;

import by.itstep.oop.Person;

public class DAnimal extends Animal{
    private Person owner;

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    void sleep(){
        System.out.println(getName()+" Он сейчас спит ");
    }
    void eat(){
        System.out.println(getName()+"eat()-> ");
    }
    void play(){
        System.out.println(getName()+"Caaaaaaaaaaaaaaatatttattataattatatata()");
    }
    void voice(){
        System.out.println("some voice....");
    }
}
