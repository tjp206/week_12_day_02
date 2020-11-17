package vehicleTypes;

import vehicleComponents.Engine;
import vehicleComponents.Tyres;

public class SUV extends Automobile {

    public SUV(String colour, double price, int doors, int seats, Engine engine, Tyres tyres) {
        super(colour, price, doors, seats, engine, tyres);
    }
}
