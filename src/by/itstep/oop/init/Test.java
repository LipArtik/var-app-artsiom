package by.itstep.oop.init;

public class Test {
    int val;

    static{
        System.out.println("Test static block");
    }

    Test(){
        System.out.println("test constructor");
        System.out.println(val);
    }


    public static void main(String[] args) {
        new Test();
        new Third();//порядок иниц в джава (static members) 1.статик филд .2 статик блок .
        // 3.не статич поля ,потом только конструктор
        System.out.println(Parent.getpStatic());


    }
}
