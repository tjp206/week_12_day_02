package vehicleComponents;

public class Tyres {

    String brand;
    String tyreType;

    public Tyres(String brand, String tyreType) {
        this.brand = brand;
        this.tyreType = tyreType;
    }

    public String getBrand() {
        return brand;
    }

    public String getTyreType() {
        return tyreType;
    }
}
