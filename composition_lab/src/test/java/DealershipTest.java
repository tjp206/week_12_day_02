import org.junit.Before;
import org.junit.Test;
import vehicleTypes.Automobile;
import java.util.ArrayList;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Automobile> automobiles;

    @Before
    public void before() {
        automobiles = new ArrayList<Automobile>();
        dealership = new Dealership(automobiles, 1000.00);
    }

}
