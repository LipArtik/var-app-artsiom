package by.itstep.oop;

public class Human {


    private static int counter;
    private  int age;

    private String name;
    public Human(){
        System.out.println(" Human +1");
        counter++;
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCounter() {
        return counter;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class TestHuman{
    public static void main(String[] args) {


      Human h1=new Human();
      int age= h1.getAge();
        new Human();
        new Human();
        new Human();
        new Human();
        int n=  Human.getCounter();

        System.out.println("Human of Humans: "+n);
        System.out.println("age : "+age);
    }
}