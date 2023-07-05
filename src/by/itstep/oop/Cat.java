package by.itstep.oop;

public class Cat {

    private String name;
    private char gender;
    private int age;
    private String color;
    private boolean isHasOwner;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.println(name + "is playing");
    }

    public void setHasOwner(boolean newHasOwner) {
        isHasOwner = newHasOwner;
    }

    public boolean getHasOwner() {
        return isHasOwner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }


}

class CaTester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Cosa");
        System.out.println("Cat is name : " + cat.getName());

    }
}