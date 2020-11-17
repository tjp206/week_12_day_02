package vehicleComponents;

public class Engine {

    String fuelType;
    double bhp;

    public Engine(String fuelType, double bhp) {
        this.fuelType = fuelType;
        this.bhp = bhp;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getBhp() {
        return bhp;
    }
}
