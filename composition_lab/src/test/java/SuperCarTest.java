import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;
import vehicleTypes.Saloon;
import vehicleTypes.SuperCar;

import static org.junit.Assert.assertEquals;

public class SuperCarTest {

    SuperCar superCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Petrol", 542.3);
        tyres = new Tyres("GoodYear", "Performance");
        superCar = new SuperCar("apple red", 125000.50, 2, 2, engine, tyres);
    }

    @Test
    public void checkBHP() {
        assertEquals(542.3, superCar.getEngine().getBhp(), 0.01);
    }
}
