import java.util.ArrayList;

public class Dealership {

    ArrayList cars;
    double till;

    public Dealership(ArrayList cars, double till) {
        this.cars = cars;
        this.till = till;
    }

    public ArrayList getCars() {
        return cars;
    }

    public double getTill() {
        return till;
    }

    public void setCars(ArrayList cars) {
        this.cars = cars;
    }

    public void setTill(double till) {
        this.till = till;
    }
}
