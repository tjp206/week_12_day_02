import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;
import vehicleTypes.SUV;
import vehicleTypes.SuperCar;

import static org.junit.Assert.assertEquals;

public class SUVTest {

    SUV suv;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Diesel", 246.8);
        tyres = new Tyres("GoodYear", "Off Road");
        suv = new SUV("Grey", 42000, 4, 7, engine, tyres);
    }

    @Test
    public void checkFuelType() {
        assertEquals("Diesel", suv.getEngine().getFuelType());
    }
}
