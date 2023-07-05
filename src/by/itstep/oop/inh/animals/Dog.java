package by.itstep.oop.inh.animals;

public class Dog extends DAnimal{
    @Override
    void sleep() {
        System.out.println("Sleep with owner ^_^");
    }

    @Override
    void eat() {
        System.out.println(getName()+" Dog Eating ////");

    }

    @Override
    void play() {
        System.out.println(getName()+" Playing with hand");
    }

    @Override
    void voice() {

        System.out.println(getName()+" GAF gaf gaf");
    }
    void serve (){
        System.out.println(getName()+" GOOD DOG");
    }
}
