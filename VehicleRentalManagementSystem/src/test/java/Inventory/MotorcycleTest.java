package Inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotorcycleTest {

    @Test
    public void testCalculateRentalCost() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 30.0);
        double cost = motorcycle.calculateRentalCost(3);
        assertEquals(90.0, cost); // 30 * 3
    }

    @Test
    public void testIsAvailableForRental() {
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 30.0);
        assertEquals("Available", motorcycle.isAvailableForRental());
        motorcycle.setAvailability(false);
        assertEquals("Not Available", motorcycle.isAvailableForRental());
    }
}