package by.itstep.oop.Modul;

public class CoffeeMachine {

    private final double maxWaterTank = 700;// ml
    private final double maxMilkTank = 1000;// ml
    private final double maxCoffeeTank = 200 ;// mg
    private double garbageTank;

    private int currentWaterTemp;

    private boolean isActive = false;
    private boolean isOn = false;

    private static int salesCounter = 0;

    private String model;
    private int numberOfCups;

    private double waterTank;

    public void addWater(int extraWater) {
        if ((extraWater + waterTank) >= maxWaterTank) {
            System.out.println("cant add water");
        } else {
            waterTank = waterTank + extraWater;
            System.out.println("current water" + waterTank + "(ml)");
        }

    }

    private double coffeeTank;

    public void addCoffee(int extraCoffee) {
        if ((extraCoffee + coffeeTank) >= maxCoffeeTank) {
            System.out.println("cant add Coffee");
        } else {
            waterTank = waterTank + extraCoffee;
            System.out.println("current Coffee" + coffeeTank + "(ml)");
        }

    }

    private double milkTank;
    private double MilkTank;

    public void addMilk(int extraMilk) {
        if ((extraMilk + milkTank) >= maxMilkTank) {
            System.out.println("cant add Milk");
        } else {
            waterTank = waterTank + extraMilk;
            System.out.println("current Milk" + milkTank + "(ml)");
        }
    }


    public CoffeeMachine(String model) {
        salesCounter++;
        this.model = model;

    }


    public void switchOn() throws InterruptedException {
        if (!isOn) {
            System.out.println("CoffeeMAchine" + model + " is starting..");
            Thread.sleep(1000);
            isOn = true;
            System.out.println("CoffeeMachine" + model + " is started!");
        } else {
            System.out.println("Already started");
        }

    }

    public void switchOff() throws InterruptedException {
        if (isOn) {
            System.out.println("CoffeeMAchine" + model + " is stopping..");
            Thread.sleep(1000);
            isOn = false;
            System.out.println("CoffeeMachine" + model + " is stopped");
        } else {
            System.out.println("Already stopped!");
        }

    }


}

