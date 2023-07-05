package by.itstep.oop;

//Class <=> Model<=>Type<=>Template(Шаблон)
// Класс(Тип) определяет будущие характеристики и функционал объекта.
public class Person {

    //field -поля характеристики будущего объекта .
    int age;
    String name;
    String lastName; //
    char gender;// can be 'f','m'
    boolean isSingle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    //methods <=>functions .Поведение будущих объектов.
    void sayMyName() {
        System.out.println("Hello ,my name is " + name);
    }

    void dance() {
        System.out.println(name + " is dancing");
    }

    void drink() {
        if (age >= 18) {
            System.out.println("Vine or and Beer");
            if (gender=='f') {
                System.out.println("Vodka");
            }
        } else {
            System.out.println("water,only water :(");
        }
    }


}

class Tester {
    public static void main(String[] args) {
        //создание переменной типа персон .
        Person person;
        //instance creation<=> object creation .с помощью оператора new создаем объект в памяти .
        person = new Person();
        //instance fields initialisation<=> object populating
        person.name = "Jora";
        person.age = 32;
        person.gender = 'm';
        person.isSingle = true;
        person.lastName = "Jorovich";

        //object behavior <=> methods invocations
        person.sayMyName();
        person.drink();
        person.dance();
        System.out.println("*******************************************************************");
        Person person1;
        person1=new Person();
        person1.name = "Joken";
        person1.age = 12;
        person1.gender = 'm';
        person1.isSingle = true;
        person1.lastName = "Sokler";
        person1.sayMyName();
        person1.drink();
        person1.dance();
        System.out.println("*******************************************************************");
        Person person2;
        person2=new Person();
        person2.name = "Luisa";
        person2.age = 22;
        person2.gender = 'f';
        person2.isSingle = true;
        person2.lastName = "Freewgole";
        person2.sayMyName();
        person2.drink();
        person2.dance();
        person2.dance();
        System.out.println("*******************************************************************");

    }



}