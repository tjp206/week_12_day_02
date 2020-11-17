import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;
import vehicleTypes.Saloon;

import static org.junit.Assert.assertEquals;

public class SaloonTest {

    Saloon saloon;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Petrol", 165.2);
        tyres = new Tyres("Yokohama", "Budget");
        saloon = new Saloon("black", 8895.00, 4, 5, engine, tyres);
    }

    @Test
    public void checkNumOfSeats() {
        assertEquals(5, saloon.getSeats());
    }
}
