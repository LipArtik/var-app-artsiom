package by.itstep.oop.patterns.factorymethod;

public abstract class Logistics {
    abstract void planDelivery();
    abstract Transport createTransport();

}
class SeaLogistics extends Logistics{
    public SeaLogistics() {
    }

    @Override
    void planDelivery() {
        System.out.println("Sea delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
class FlyLogistics extends Logistics{
    public FlyLogistics() {
        System.out.println("PLane +1");
    }

    @Override
    void planDelivery() {
        System.out.println("fly delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
class RoadLogistics extends Logistics{

    @Override
    void planDelivery() {
        System.out.println("truck delivery plan");
    }

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
 class LogisticsProvider{
    public static Logistics chooseLogistics(String type){
        switch (type){
            case "AIR":
                return  new FlyLogistics();
            case"Sea":
                return new SeaLogistics();
            case"Road":
                return new RoadLogistics();
            default:
                System.out.println("Wrong type :"+type);
                return new RoadLogistics();

        }

    }
 }
 class LogisticClient{
     public static void main(String[] args) {
         Logistics logistics=LogisticsProvider.chooseLogistics("Air");
         logistics.createTransport();
         logistics.planDelivery();
     }
 }

