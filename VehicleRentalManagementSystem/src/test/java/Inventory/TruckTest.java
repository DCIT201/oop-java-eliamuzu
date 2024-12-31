package Inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {

    private Truck truck;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        truck = new Truck("Ford F-150", 100.0);
        customer = new Customer("Jane", "Doe", "jane.doe@example.com", "555-5678", "456 Elm St");
    }

    @Test
    public void testRent() {
        truck.rent(customer, 5);
        assertFalse(truck.getAvailability());
        assertTrue(Truck.getRentedTrucks().contains(truck));
        assertFalse(Truck.getAvailableTrucks().contains(truck));
    }

    @Test
    public void testCancelRent() {
        truck.rent(customer, 5);
        truck.cancelRent(customer, 5);
        assertTrue(truck.getAvailability());
        assertFalse(Truck.getRentedTrucks().contains(truck));
        assertTrue(Truck.getAvailableTrucks().contains(truck));
    }

    @Test
    public void testGetRentedTrucks() {
        truck.rent(customer, 5);
        assertTrue(Truck.getRentedTrucks().contains(truck));
    }

    @Test
    public void testGetAvailableTrucks() {
        assertTrue(Truck.getAvailableTrucks().contains(truck));
        truck.rent(customer, 5);
        assertFalse(Truck.getAvailableTrucks().contains(truck));
    }
}