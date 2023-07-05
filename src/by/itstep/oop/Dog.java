package by.itstep.oop;

public class Dog {

    private long id;
    private String name;
    private String type;
    private char gender;
    private int age;

    private double w;
    private double h;

    //getters and setters (методы для получения либо модифицирования полей)
    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Incorrect age :" + newAge);
        } else {
            age = newAge;
        }

    }





}

class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Doplen");

        System.out.println("Name is " + dog1.getName());
        dog1.setAge(-2);
        System.out.println("Age is " + dog1.getAge());
    }
}