package vehicleTypes;

import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public abstract class Automobile {

    String colour;
    double price;
    int doors;
    int seats;
    Engine engine;
    Tyres tyres;


    public Automobile(String colour, double price, int doors, int seats, Engine engine, Tyres tyres) {
        this.colour = colour;
        this.price = price;
        this.doors = doors;
        this.seats = seats;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
