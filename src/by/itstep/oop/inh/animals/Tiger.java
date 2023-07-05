package by.itstep.oop.inh.animals;

public class Tiger extends Cat{
    void attack(){
        System.out.println(getName()+" agressive");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(getName()+"BLOOD MEAT");
    }
}
