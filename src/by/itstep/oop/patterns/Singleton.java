package by.itstep.oop.patterns;
import java.util.Date;

public class Singleton {

    private static Singleton singleton;
    private String value;

    private Singleton() {
        System.out.println("new Instance created");
    }

    public String getValue() {
        return value;
    }

    //Lazy implementation Создание экземпляра по первому требованию .
    public static Singleton getSingleton() {
        if(singleton==null){
            singleton=new Singleton();
        singleton.value=new Date().toString();
        }
        return  singleton;
    }


}

class SingleDemo{
    public static void main(String[] args) {
      Singleton singleton= Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(singleton.getValue());
        Singleton singleton2= Singleton.getSingleton();
        System.out.println(singleton2);
        Singleton singleton3= Singleton.getSingleton();
        System.out.println(singleton2);
        System.out.println(singleton.getValue());
    }
}
