package by.itstep.oop.inh;
//класс чайлд расширяет(наследует) класс перент
// 'IS-A' relationship.когда наследник есть родитель .

import by.itstep.oop.Cat;

public class Child extends Parent {

    //'has-a' relationship
    private Cat cat;



     private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
    public void jump(){
        System.out.println("jumping "+getName());
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }
//переопределение (перекрытие)- способность изменить функционал который был до этого в базовом классе.
    @Override
    public void sayMyName() {
        //ссылка на супер клас(super)
        super.sayMyName();
        System.out.println("My name is :"+getName());

    }
}
