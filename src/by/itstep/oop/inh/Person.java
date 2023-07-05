package by.itstep.oop.inh;

public class Person {
    private int id;
    private String name;
    private String lastname;
    private char gender;


    //конструктор -единственный способ создать объект
    //Конструктор никогда ничего не возвращает

    public Person() {
        //вызов существующего конструктора в этом классе
        //вызов конструктора должен быть в первом лайне
        this(0, "Stranger");

    }


    //конструктор который будет иницилизировать поля
    public Person(int id, String name, String lastname, char gender) {
        System.out.println("Person +1 ");
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public Person(int id, String name) {
      this(id, name,null,' ');
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(134);
        p.setGender('m');
        p.setLastname("Ivanova");
        p.setName("Lisa");
        System.out.println(p.toString());
        Person p2 = new Person();
        System.out.println(p2.toString());
        Person p3 = new Person();
        System.out.println(p3.toString());

        Employee e1 = new Employee();
        e1.setId(342);
        e1.setName("John");
        e1.setLastname("Jokler");
        e1.setGender('m');
        e1.setSalary(1250);

        System.out.println(e1);


        Person p4 = new Person(55, "Mike", "Tayson", 'M');
        System.out.println(p4);


        Person p5 = new Person(666, "Tom");
        Employee e2=new Employee();
        System.out.println(e2);
        Employee e3=new Employee(3421,"alex","kolip",'m',32132132);
        System.out.println(e3);
        Student s1=new Student(34322,"max","Ivanov",'F',8.8);
        System.out.println(s1);


    }

}