package by.itstep.oop.inh.animals;

public class Cat extends DAnimal {
    @Override
    void sleep() {
        System.out.println(getName()+"Sleep... ZZZZZZZZZ");
    }
@Override
    void eat(){
        System.out.println(getName()+"eat()-> Milk");
    }
    @Override
    void play(){
        System.out.println(getName()+"Caaaaaaaaaaaaaaatatttattataattatatata()");
    }
    @Override
    void voice(){
        System.out.println(getName()+"meow-meow-meow");
    }
}
