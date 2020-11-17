import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList vehicles;

    public Customer(double money, ArrayList vehicles) {
        this.money = money;
        this.vehicles = vehicles;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList getVehicles() {
        return vehicles;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setVehicles(ArrayList vehicles) {
        this.vehicles = vehicles;
    }
}
