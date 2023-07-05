package by.itstep;

public class Sneakers {
    private String brand;
    private double price;
    private double size;
    private String artCode;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double newSize) {
        size = newSize;
    }

    public String getArtCode() {
        return artCode;
    }

    public void setArtCode(String newArtCode) {
        artCode = newArtCode;
    }


}

class SneakerTester {
    public static void main(String[] args) {
        Sneakers snk=new Sneakers();
        snk.setBrand("Adidas");
        System.out.println("Brand for search : " + snk.getBrand());
        Sneakers snk1=new Sneakers();
        snk1.setBrand("Nike");
        System.out.println("Brand for search : " + snk1.getBrand());
        Sneakers snk2=new Sneakers();
        snk2.setBrand("Puma");
        System.out.println("Brand for search : "+ snk2.getBrand());

    }
}