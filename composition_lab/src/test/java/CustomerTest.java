import org.junit.Before;
import vehicleTypes.Automobile;

import java.util.ArrayList;

public class CustomerTest {

    Customer customer;
    ArrayList<Automobile> vehicles;

    @Before
    public void before() {
        vehicles = new ArrayList<Automobile>();
        customer = new Customer(25000, vehicles);
    }
}
