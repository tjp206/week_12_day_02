import org.junit.Before;
import org.junit.Test;
import vehicleComponents.Engine;
import vehicleComponents.Tyres;
import vehicleTypes.Electric;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Battery Powered", 321.7);
        tyres = new Tyres("Hankook", "Budget");
        electric = new Electric("Blue", 37500.00, 4, 5, engine, tyres);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electric.getEngine());
    }

}
