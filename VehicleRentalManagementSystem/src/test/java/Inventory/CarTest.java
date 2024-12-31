package Inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCalculateRentalCost() {
        Car car = new Car("Toyota Corolla", 50.0, true, true);
        double cost = car.calculateRentalCost(3);
        assertEquals(180.0, cost); // 50 * 3 + 10 * 3
    }

    @Test
    public void testIsAvailableForRental() {
        Car car = new Car("Toyota Corolla", 50.0, true, true);
        assertEquals("This car is available", car.isAvailableForRental());
        car.setAvailability(false);
        assertEquals("This car is not available", car.isAvailableForRental());
    }
}